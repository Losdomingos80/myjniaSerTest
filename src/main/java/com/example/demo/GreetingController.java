package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private String kwota = "0";
	private int suma = 0;

	@GetMapping("/add")
	public String doladuj(@RequestParam(value = "ile") String ile) {
		
		kwota = ile;
		return kwota;
	}
	
	@GetMapping("/get")
	public String uruchom() {
		suma = suma + Integer.valueOf(kwota);
		String temp = kwota;
		kwota = "0";
		return temp;
	}
	
	@GetMapping("/check")
	public String sprawdz() {
		
		return Integer.toString(suma);
	}
	
}
