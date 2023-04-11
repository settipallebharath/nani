package com.text.bharath;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class exp 
{
	@GetMapping("/Hai")
public String welcome()
{
	return"Welcome to spring boot app development";

}
}