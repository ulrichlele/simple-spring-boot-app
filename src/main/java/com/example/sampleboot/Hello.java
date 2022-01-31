package com.example.sampleboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@GetMapping("greetings")
	public String greet() {
		return "Hi all; sampleboot";
	}

}
