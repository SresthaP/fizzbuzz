package com.doSelect.fizzbuzz.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class FizzBuzzServiceImplTest {

	@Test
	void testFizzBuzzListTrue() {
		FizzBuzzServiceImpl fizzbuzzServiceImpl = new FizzBuzzServiceImpl();
		int num1=2;
		int num2=3;
		int limit=10;
		String str1="fizz";
		String str2="buzz";
		
		List<String> actualFizzBuzzList =fizzbuzzServiceImpl.getfizzBuzzList(num1, num2, limit, str1, str2);
		List<String> expectedFizzBuzzList = new ArrayList<String>();
		expectedFizzBuzzList.add("1");
		expectedFizzBuzzList.add("fizz");
		expectedFizzBuzzList.add("buzz");
		expectedFizzBuzzList.add("fizz");
		expectedFizzBuzzList.add("5");
		expectedFizzBuzzList.add("fizzbuzz");
		expectedFizzBuzzList.add("7");
		expectedFizzBuzzList.add("fizz");
		expectedFizzBuzzList.add("buzz");
		expectedFizzBuzzList.add("fizz");
		assertEquals(actualFizzBuzzList, expectedFizzBuzzList);
		
	}
	
	@Test
	void testFizzBuzzListFalse() {
		FizzBuzzServiceImpl fizzbuzzServiceImpl = new FizzBuzzServiceImpl();
		int num1=3;
		int num2=5;
		int limit=5;
		String str1="fizz";
		String str2="buzz";
		
		List<String> actualFizzBuzzList =fizzbuzzServiceImpl.getfizzBuzzList(num1, num2, limit, str1, str2);
		List<String> expectedFizzBuzzList = new ArrayList<String>();
		expectedFizzBuzzList.add("1");
		expectedFizzBuzzList.add("2");
		expectedFizzBuzzList.add("buzz");
		expectedFizzBuzzList.add("fizz");
		expectedFizzBuzzList.add("5");
		assertTrue(actualFizzBuzzList!=expectedFizzBuzzList);
	}

	@Test
	void testBlankFizzBuzzList() {
		FizzBuzzServiceImpl fizzbuzzServiceImpl = new FizzBuzzServiceImpl();
		int num1=3;
		int num2=5;
		int limit=0;
		String str1="fizz";
		String str2="buzz";
		
		List<String> actualFizzBuzzList =fizzbuzzServiceImpl.getfizzBuzzList(num1, num2, limit, str1, str2);
		
		assertTrue(actualFizzBuzzList.size()<= 0);
			
	}

}
