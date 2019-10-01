package com.cookie.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by amazing_cookie on 2019/10/1.
 */
@RestController
public class Blog {

	@RequestMapping("/hello")
	public String hello(){
		return "Hello";
	}
}
