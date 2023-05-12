package com.naru.api.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naru.api.DTO.MemberDTO;

@RestController
@RequestMapping("/post")
public class SecondApiPOST {
	
	
	// post to requestBody
	// use goole chrome extension `talend api tester`
	@PostMapping("/requestBody")
	public String postMember(
			@RequestBody Map<String, Object> postData
			) {
		
		return postData.toString();
	}
	
	@PostMapping("/requestbody/dto")
	public String postMemberDTO(
			@RequestBody MemberDTO memberDTO
			) {
		
		return memberDTO.toString();
	}

}
