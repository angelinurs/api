package com.naru.api.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/speci")
public class SwaggerSpecificationController {
	
	// uri lesson 01.
	
	@GetMapping( "/api/{test}/{value}")
	public Map<String, String> first(
			// use pathVariable annotation 1.
			@PathVariable String value,
			// use pathVariable annotation 2.
			@PathVariable("test") String middlePath
			) {		
		
		Map<String, String> map = new HashMap<>();
		
		map.put("middle path", middlePath );
		map.put("last path", value );
		
		return map;
	}
	
	// uri lesson 02.
	
	@GetMapping("/api")
	public Map<String, String> second( @RequestParam Map<String, String> param ) {
		StringBuilder sb = new StringBuilder();
		
		param.entrySet().forEach(map -> {
			sb.append( map.getKey() + " : " + map.getValue() + " \n " );
		});
		
		param.put("result params", sb.toString());
		
		return param;
		
	}
	
	// swagger specification
	@ApiOperation( value="GET method example", notes="It's GET Method using @RequestParam" )
	@GetMapping( "/req" )
	public String getReauestParam(
			@ApiParam( value="이름", required=true ) @RequestParam String name,
			@ApiParam( value="이메일", required=true ) @RequestParam String email,
			@ApiParam( value="회사", required=true ) @RequestParam String organization
			) {
		
		return name + " : " + email + " : " + organization;
	}
	
	// log test
	@GetMapping( value="/log/test" )
	public String logTest() {
		log.info( "[test log] {} function call", "logtest" );
		return "complete";
	}

}
