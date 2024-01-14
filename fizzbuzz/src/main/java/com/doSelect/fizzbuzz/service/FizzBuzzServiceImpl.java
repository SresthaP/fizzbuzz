package com.doSelect.fizzbuzz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzServiceImpl implements FizzBuzzService{

	
	public List<String> getfizzBuzzList(int num1, int num2, int listLimit, String str1, String str2) {
		
		List<String> fizzBuzzList = new ArrayList<String>();
		for(int i=1; i<=listLimit; i++) {
			
			if(i%num1==0 && i%num2==0) {
				fizzBuzzList.add(str1+str2);
			}
			else if(i%num1==0) {
				fizzBuzzList.add(str1);
			}
			else if (i%num2==0) {
				fizzBuzzList.add(str2);
			}
			else {
				fizzBuzzList.add(String.valueOf(i));
			}
			
		}
			
		return fizzBuzzList;
		}

}
