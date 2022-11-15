package com.amine.wiremind;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/Wiremind/aminecontroller")
public class AmineController {
	
	
	@GetMapping("/test")
   	public String test() {
   		return "hello world amine ounissi !" ; 
   	}

}
