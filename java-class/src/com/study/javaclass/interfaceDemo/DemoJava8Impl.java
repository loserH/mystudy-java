package com.study.javaclass.interfaceDemo;

public class DemoJava8Impl implements DemoJava8 {

	@Override
	public void doSomthing() {

	}

	public static void main(String[] args) {
		DemoJava8 demoJava8 = new DemoJava8Impl();
		demoJava8.anotherDefaultMehtod();
	}
}
