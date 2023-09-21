package com.kh.junit.practice;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ArrayPracticeTest {
	private ArrayPractice arrp;

	@Test
	public  void testPractice1() {
		int[] expected = {1,2,3,4,5,6,7,8,9,10};
		int[] actual = {0,1,2,3,4,4,5,6,7,8,};
		assertEquals(expected, actual);
	}
	@Test
	public void testPractice2() {
		int[] expected = {0,1,2,3,4,5,6,7,8,9};
		int[] actual = {0,1,2,3,4,5,6,7,8,9};
		assertEquals(expected, actual);
	}
	@Test
	public void testPractice3() {
		int[] expected = {1,2,3,4};
		//int[] actual = {1,2,3,4};
		assertEquals(expected, arrp.getArray());
	}
	@Test
	public void testPractice4() {
		String[] expected = {"»ç°ú","±Ö","Æ÷µµ","º¹¼þ¾Æ","Âü¿Ü"};
		//String[] actual = {"»ç°ú","±Ö","Æ÷µµ","º¹¼þ¾Æ","Âü¿Ü"};
		assertEquals(expected, arrp.getArray1());
	
	}

}
