package junitByusingJAVA;

public class Junit {
	
	public int calculateSum(int[]numbers) {
		int sum=0;
		for(int num:numbers) {
			sum+=num;
		}
		return sum;
	}
	
	public int Adding(int a,int b) {
		int sum=0;
		sum=a+b;
		return sum;
	}
	public String names(String a,String b) {
		
		return a+b;	
	}

}
