package com.mycompany.main;

public class StaticClass {
	static float x;
	static float y;
	
	public StaticClass() {
		x = 2;
		y = 4;
	}
	
	public StaticClass(float one, float two) {
		x = one;
		y = two;
	}
	
	public static float summing() {
		return x+ y;
	}

}
