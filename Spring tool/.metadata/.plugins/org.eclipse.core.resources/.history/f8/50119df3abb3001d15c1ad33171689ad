package junitByusingJAVA.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junitByusingJAVA.Junit;

class JunitTest {
	
	Junit test=new Junit();

	@Test
	void three_Array() {
			
		assertEquals(6, test.calculateSum(new int[] {1,2,3}));
	}
	@Test
	void two_Array() {
			
		assertEquals(7, test.calculateSum(new int[] {4,3}));
	}
     
	@Test
	void test1() {
		assertEquals(6, test.Adding(5, 1));

	}
	@Test
	void test2() {
		assertEquals("naresh",test.names("nar", "esh"));
	}
	
	Junit test1=new Junit();
	@Test
	void test3() {
		int excepted=10;
		int actual=test1.Adding(5, 5);
		
		assertEquals(excepted, actual);
	}
}
