package com.example.pykubetech;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

	@GetMapping("/test")
	public Map<String,Object> myDate(){
		Map<String,Object> response=new HashMap<>();
		response.put("message", "I am daddy!!!!!!!!!!!!!");
		response.put("code", "204");
		return response;
	}
}
