package com.linsoft.springbootsampleapi.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	//@RequestMapping("/hello")
	@RequestMapping(method = RequestMethod.GET ,value = "/hello" )
	//by default GET is used.
	public String sayhello()
	{
		return "Hello World";
	}
}
