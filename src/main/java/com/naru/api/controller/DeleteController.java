package com.naru.api.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delete")
public class DeleteController {

	@DeleteMapping( value = "/{variable}")
	public String deleteVariable( @PathVariable String variable) {
		return variable;
	}
	
	@DeleteMapping( value = "/param" )
	public String deleteParams( @RequestParam String email) {
		return "email : " + email;
	}
}
