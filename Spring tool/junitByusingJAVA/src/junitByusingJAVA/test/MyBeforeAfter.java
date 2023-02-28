package junitByusingJAVA.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;

class MyBeforeAfter {
	
	// all methods should be Static
	// it will excute first and last by (BeforeAll and AfterAll)
	@BeforeAll                
	static void beforeAll() {
		System.out.println("beforeAll");
	}
	
	@BeforeEach            // it will execute before All the test cases
	void beforeEach() {
		System.out.println("beforeEach");
	}

	@Test
	void test() {
		System.out.println(" === test1");
	}
    @DisplayName("Important") 
	@Test
	void test1() {
		System.out.println(" === test2");
	}
	@Test
	void test3() {
		System.out.println("test3");
	}
	
	@AfterEach     // it will execute After All the test cases
	void AfterEach () {
		System.out.println("AfterEach");
	}
	
	@AfterAll                   // all methods should be Static
	 static void AfterAll () {
		System.out.println("AfterAll");
	}
	

}
