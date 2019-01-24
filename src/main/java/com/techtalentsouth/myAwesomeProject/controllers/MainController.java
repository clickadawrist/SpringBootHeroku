package com.techtalentsouth.myAwesomeProject.controllers;
//"anything within this "controllers" file folder I can use"

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//why is this not working?
//src/main/resources...
//put index.html file into static if it doesn't need to belong to anything else
//for other dynamic structures (ie connection to a class), it can be put into templates > main

@Controller //import
public class MainController {
//@RestController: Tells spring we're going to use http verbs: GET, POST, PUT, PATCH, DELETE
//@Controller: this is going to control...yeah
	
	//Request mapping: you're going to receive a request file
	//basically everything inside here will show up on localhost8080
	@GetMapping("/") //import //anticipates HTML
	public String index() {
	//index = a reference to a home page
		// we're defining a route
		// backslash / refers to localhost
		
		/* templates = html files
		usually return index.html; */
		
		//HTML file tied to index method
		//src/main/resources is where index.html go
			//created main folder
				//created index.html
		//is checking templates level first. Append /../index.html if it's deeper
		//if there is nothing in templates, it will check static
		return "index.html";
	}
}