package com.mycompany.main;

public class Application {
	public static void main(String[] args) {
		StaticClass first = new StaticClass(7, 8);
		System.out.println("Static "+ first.summing());
		FinalClass second = new FinalClass(9);
		System.out.println("Final "+ second.myConstant);
		ConcreteClass third = new ConcreteClass();
		third.run();
		
		
		
	}

}
