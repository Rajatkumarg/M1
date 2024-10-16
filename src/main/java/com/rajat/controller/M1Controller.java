package com.rajat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/m1")
public class M1Controller {

	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/getDataM1")
	public String getDataM1() {
		
		String toSendToM2 = "Apple";
		
		String url = "http://M2/m2/getDataM2/"+toSendToM2;
		
		String data = restTemplate.getForObject(url, String.class);
		
		return "Final "+data;
	}
}
