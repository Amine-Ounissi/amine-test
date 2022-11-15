package com.amine.wiremind;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WiremindApplication {

	public static void main(String[] args) {
		SpringApplication.run(WiremindApplication.class, args);
		Scanner input = new Scanner(System.in);
		System.out.println("firstname:");
		String firstname= input.nextLine();
		System.out.println("lastname:");
		String lastname= input.nextLine();

		    System.out.println("Hello your name is"+ " "+ firstname +" "+ lastname);
		  }
	

}
