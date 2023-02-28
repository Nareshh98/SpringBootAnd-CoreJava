package com.healthycoderapp.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.healthycoderapp.AcitvityCalculater;

class AcitvityCalculaterTest {

	@Test
	void Should_ReturnBad_When_AvgBelow20() {
		//given
		int WeeklyCardioMins=40;
		int WeeklyworkOuts=1;
		
		// when
		String actual=AcitvityCalculater.Work_Outs(WeeklyCardioMins, WeeklyworkOuts);		
		// then
		
		assertEquals("bad", actual);
		
	}
	@Test
	void Should_ReturnAverage_When_AvgBelow20And40() {
		       //given
				int WeeklyCardioMins=40;
				int WeeklyworkOuts=3;
				
	// when
	String actual=AcitvityCalculater.Work_Outs(WeeklyCardioMins, WeeklyworkOuts);		
	// then
				
		assertEquals("Average", actual);
				
		
	}
	@Test
	void Should_Returngood_When_AvgBelow40() {
		//given
		int WeeklyCardioMins=40;
		int WeeklyworkOuts=7;
		
		// when
		String actual=AcitvityCalculater.Work_Outs(WeeklyCardioMins, WeeklyworkOuts);		
		// then
		
		assertEquals("good", actual);
			
		
	}
	@Test
	void Should_ThrowException_When_InputBelowZero() {
		//given
		int WeeklyCardioMins=-40;
		int WeeklyworkOuts=7;
		
		// when
		Executable excutable=()->AcitvityCalculater.Work_Outs(WeeklyCardioMins, WeeklyworkOuts);		
		// then
		
		assertThrows(RuntimeException.class, excutable);
		
	}
}
