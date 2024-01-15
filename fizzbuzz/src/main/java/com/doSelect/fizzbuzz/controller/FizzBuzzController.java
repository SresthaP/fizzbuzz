package com.doSelect.fizzbuzz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.doSelect.fizzbuzz.service.FizzBuzzService;






@RestController
public class FizzBuzzController {
	
	@Autowired
	private FizzBuzzService fizzBuzz;

	 
	 @RequestMapping("/getFizzBuzzList")
		public List<String> getFizzBuzzList(@RequestParam(value="num1") int num1,
				@RequestParam(value="num2") int num2,@RequestParam(value="limit") int limit,
				@RequestParam(value="str1") String str1,@RequestParam(value="str2") String str2){

		 List<String> fizzBuzzList= fizzBuzz.getfizzBuzzList(num1, num2, limit, str1, str2);

		 return fizzBuzzList;
		}
}
