package com.naru.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/timeto")
public class TimeStampToStringController {

	@GetMapping("/m")
	public String timeto() {
		return String.valueOf(System.currentTimeMillis());
	}
}
