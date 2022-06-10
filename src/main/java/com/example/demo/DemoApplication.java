package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		System.out.println("Bismillah\n");

		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter Name: ");

		String userName = myObj.nextLine();
		System.out.println("Welcome " + userName);
		System.out.println("Initiating API...");

		System.out.println("");
		System.out.println("Local Access: http://localhost:8080/greeting");
		System.out.println("");
		System.out.println("Local Access with Username: http://localhost:8080/greeting?name=User");
		System.out.println("\t*NOTE* Where '?name=User' can be changed to desired username such as '?name=Abubakar'");

		SpringApplication.run(DemoApplication.class, args);
	}

}
