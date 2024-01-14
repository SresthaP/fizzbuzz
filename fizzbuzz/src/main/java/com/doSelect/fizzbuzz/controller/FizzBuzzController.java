package com.doSelect.fizzbuzz.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.doSelect.fizzbuzz.service.FizzBuzzService;






@RestController

public class FizzBuzzController {
	
	@Autowired
	private FizzBuzzService fizzBuzz;
	

	@GetMapping("/hello")
	public String hello(){
		
		
		return "HI";
	}
	 
	 @RequestMapping("/getFizzBuzzList")
		public List<String> getFizzBuzzList(@RequestParam(value="num1") int num1,
				@RequestParam(value="num2") int num2,@RequestParam(value="limit") int limit,
				@RequestParam(value="str1") String str1,@RequestParam(value="str2") String str2){
			
		 //FizzBuzzService obj= new FizzBuzzService();

		 List<String> fizzBuzzList= fizzBuzz.getfizzBuzzList(num1, num2, limit, str1, str2);

			/*
			 * List<String> fizzBuzzList= new ArrayList<String>(); for(int i=0; i<=limit;
			 * i++) {
			 * 
			 * if(i%num1==0 && i%num2==0) { fizzBuzzList.add(str1+str2); } else
			 * if(i%num1==0) { fizzBuzzList.add(str1); } else if (i%num2==0) {
			 * fizzBuzzList.add(str2); } else { fizzBuzzList.add(String.valueOf(i)); }
			 * 
			 * }
			 * 
			 * return fizzBuzzList;
			 */	//list = this.fizzBuzzService.getfizzBuzzList(num1, num2, limit, str1, str2);
		 return fizzBuzzList;
		}
}
