package junitByusingJAVA.test;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PraticingTestCases {

	@Test
	void test() {
		int[] excepted= {1,2,3,4};
		int[] actual= {1,2,3,4};
		
		assertArrayEquals(excepted,actual,"testcase failed");
		//this is the text will show when it fails in first line
		
	}
	@Tag("First references testCases")
	@Test
	void test2() {
		String a="xyz";
		String b="xyz";
		
		assertSame(a,b);	
	}
	@Test
	void test3() {
		String a="xyz";
		String b="xyzz";
		
		assertNotSame(a,b);	
	}
	@Tag("Second references testCases")
	@Test
	void test4() {
		String a=null;
		
		assertNull(a);
	}
	@Test
	void test5() {
		String a="abc";
		
		assertNotNull(a);
	}
	@Test
	void test6() {
		int a=30;
		int b=20;
		
		assertTrue(a>b);
		assertFalse(a<b);
	}
	
	@Test
	void test7() {
		
		assertThat("123",CoreMatchers.is("123"));
	}
	
//	@Test
//	void test8() {
//		
//		Assertions.fail("hello"); // this is an  fail method 
//		Assertions.fail(PraticingTestCases::message);
//	}
//	private static String message() {
//		return "hello";
//	}
	
	@Disabled("ImplementPending")
	@Test
	void test9() {
		
		
	}
	
}
