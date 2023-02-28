package com.healthycoderapp;

public class AcitvityCalculater {
	
	private static final int WORKOUT_DURATION_MIN=45;
	
	public static String Work_Outs(int weeklyCardioMin,int weeklyWorkoutSessions) {
		
		
		if(weeklyCardioMin<0 || weeklyWorkoutSessions<0) {
			throw new RuntimeException("input below 0");
		}
		
       int totalMinitues = weeklyCardioMin + weeklyWorkoutSessions * WORKOUT_DURATION_MIN;
		
		double avgDailyActivityMins = totalMinitues/7.0;
		
		
		if(avgDailyActivityMins < 20) {
			return "bad";
		}
		else if(avgDailyActivityMins < 40) {
			return "Average";
		}
			
		return "good";
		
	}

	public static void main(String[] args) {

	}

}
