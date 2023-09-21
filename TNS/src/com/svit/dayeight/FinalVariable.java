package com.svit.dayeight;

public class FinalVariable {
final int speedlimit=90; // constant
	
	void run() {
		int speedlimit=125;
	}
	
	public static void main(String[] args) {
		
		FinalVariable obj = new FinalVariable();
		obj.run();
		
	}

}
