package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller{
	
	
	@RequestMapping("/")
	public String main(){
		return "main  abc 123 456 4566556rrrr7";
	}


    @RequestMapping("/testing")
    public String testing(){
        return "testing";
    }
	
}