package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private String s1001 = "0";
	private int suma1001 = 0;
	private String s1002 = "0";
	private int suma1002 = 0;
	private String s1003 = "0";
	private int suma1003 = 0;
	private String s1004 = "0";
	private int suma1004 = 0;
	private String s1005 = "0";
	private int suma1005 = 0;
	

	@GetMapping("/add")
	public String doladuj(@RequestParam(value = "ile") String ile, @RequestParam(value = "gdzie") String gdzie) {
		
		if(gdzie.equals("1001")) {
			s1001 = ile;
		}
		if(gdzie.equals("1002")) {
			s1002 = ile;
		}
		if(gdzie.equals("1003")) {
			s1003 = ile;
		}
		if(gdzie.equals("1004")) {
			s1004 = ile;
		}
		if(gdzie.equals("1005")) {
			s1005 = ile;
		}
		return "doładowanie myjni nr: " + gdzie + ", na impulsy : " + ile ;
	}
	
	@GetMapping("/get")
	public String uruchom(@RequestParam(value = "kto") String kto) {
		
		String temp = "0";
		if(kto.equals("1001")) {
			suma1001 = suma1001 + Integer.valueOf(s1001);
			temp = s1001;
		}
		if(kto.equals("1002")) {
			suma1002 = suma1002 + Integer.valueOf(s1002);
			temp = s1002;
		}
		if(kto.equals("1003")) {
			suma1003 = suma1003 + Integer.valueOf(s1003);
			temp = s1003;
		}
		if(kto.equals("1004")) {
			suma1004 = suma1004 + Integer.valueOf(s1004);
			temp = s1004;
		}
		if(kto.equals("1005")) {
			suma1005 = suma1005 + Integer.valueOf(s1005);
			temp = s1005;
		}
		
		return temp;
	}
	
	@GetMapping("/confirm")
	public String potw(@RequestParam(value = "kto") String kto) {
		
		String temp = "0";
		if(kto.equals("1001")) {
			s1001 = "0";
		}
		if(kto.equals("1002")) {
			s1002 = "0";
		}
		if(kto.equals("1003")) {
			s1003 = "0";
		}
		if(kto.equals("1004")) {
			s1004 = "0";
		}
		if(kto.equals("1005")) {
			s1005 = "0";
		}
		
		return "ok";
	}
	
	@GetMapping("/check")
	public String sprawdz() {
		
		return "Suma razem : " + Integer.toString(suma1001+suma1002+suma1003+suma1004+suma1005);
	}
	
}
