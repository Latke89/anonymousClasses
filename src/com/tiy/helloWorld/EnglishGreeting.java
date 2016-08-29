package com.tiy.helloWorld;

/**
 * Created by Brett on 8/29/16.
 */
public class EnglishGreeting {

	String name = "world";
	public void greet() {
		greetSomeone("world");
	}
	public void greetSomeone(String someone) {
		name = someone;
		System.out.println("Hello " + name);
	}

}
