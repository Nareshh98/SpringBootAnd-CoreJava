package junitByusingJAVA.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyTest {
	
    List<String> list=Arrays.asList("AWS" ,"DevOps","Spring","");

	@Test
	void test() {
		boolean test=list.contains("AWS");
		boolean test2=list.contains("abc");
		
		//assertEquals(true, test);
		//or
		assertTrue(test); // only if true means it will work
		assertFalse(test2); //// only if false means it will work
		
		
		
		assertEquals(3, list.size()); // to check size
		
		//assertNull,assertNotNull
		
		assertArrayEquals( new int[] {1,2}, new int[] {1,2});
		
	   //assertArrayEquals( new int[] {1,2}, new int[] {2,1}); not equal
	}

}
