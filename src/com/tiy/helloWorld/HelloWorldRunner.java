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

		EnglishGreeting myEngGreeting = new EnglishGreeting();
		GermanGreeting myGerGreeting = new GermanGreeting();
		SpanishGreeting mySpnGreeting = new SpanishGreeting();
		myEngGreeting.greetSomeone(myEngGreeting.name);
		myGerGreeting.greetSomeone("Fred");
		mySpnGreeting.greetSomeone(mySpnGreeting.name);

	}
}
