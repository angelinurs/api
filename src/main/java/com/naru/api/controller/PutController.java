package com.naru.api.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naru.api.DTO.MemberDTO;

@RestController
@RequestMapping("/put")
public class PutController {
	
	@PutMapping( "/test1")
	public String postMember( @RequestBody Map<String, Object> putData ) {
		
		StringBuilder sb = new StringBuilder();
		
		putData.entrySet().forEach( map -> {
			sb.append(map.getKey() + " : " + map.getValue() + "\n" );
		});
		
		return sb.toString();
	}
	
	@PutMapping("/member1")
	public String postMember(@RequestBody MemberDTO memberDTO ) {
		
		return memberDTO.toString();
	}
	
	@PutMapping("/member2")
	public MemberDTO postMember2(@RequestBody MemberDTO memberDTO ) {
		
		return memberDTO;
	}

	@PutMapping("/member3")
	public ResponseEntity<MemberDTO> postMember3( @RequestBody MemberDTO memberDTO ) {
		return ResponseEntity
				.status(HttpStatus.ACCEPTED)
				.body(memberDTO);
	}
}
