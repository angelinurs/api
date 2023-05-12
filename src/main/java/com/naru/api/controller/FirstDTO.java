package com.naru.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naru.api.DTO.MemberDTO;

@RestController
@RequestMapping("/dto")
public class FirstDTO {
	
	/*
	 * - Case 01.
	 * # request on browser follow line
	 * http://localhost:8080/dto/first?name=naru&email=naru@email.com&organization=alice
	 * # response
	 * MemberDTO { name = naru, email= naru@email.com, organization=alice }
	 * 
	 * - Case 02.
	 * # request on browser follow line
	 * http://localhost:8080/dto/first?name=naru&email=naru@email.com
	 * # response
	 * MemberDTO { name = naru, email= naru@email.com, organization=null }
	 */
	
	@GetMapping( "/first")
	public String firstDTO( MemberDTO memberDTO) {
		
		return memberDTO.toString();
		
	}

}
