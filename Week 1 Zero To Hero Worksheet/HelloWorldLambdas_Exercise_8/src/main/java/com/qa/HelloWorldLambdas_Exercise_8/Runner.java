package com.qa.HelloWorldLambdas_Exercise_8;

public class Runner implements GreetingService {

	static String hello = "Hello ";

	public static void main(String args[]) {
		GreetingService greetService1 = message -> System.out.println(hello + message);
		greetService1.sayMessage("World!!");
	}

	@Override
	public void sayMessage(String message) {

	}

}
