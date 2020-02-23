package com.matheus.spring.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodeController {

	@GetMapping(value="/test", produces = MediaType.TEXT_PLAIN_VALUE)
	public String getTest(){
		return "TEST";
	}
}
