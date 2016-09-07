package com.tiy.helloWorld;

/**
 * Created by Brett on 8/29/16.
 */
public class HelloWorldRunner {
	public static void main(String[] args) {
		HelloWorldRunner myRunner = new HelloWorldRunner();

		myRunner.sayHello();
	}


	public void sayHello() {

		HelloWorld myEngGreeting = new EnglishGreeting();
		HelloWorld myGerGreeting = new GermanGreeting();
		HelloWorld mySpnGreeting = new SpanishGreeting();
		myEngGreeting.greet();
		myGerGreeting.greetSomeone("Fred");
		mySpnGreeting.greet();

	}
}
