package com.subodh.new_features;

import java.util.stream.Stream;

@FunctionalInterface
interface Calculator{
	void calculator(int a,int b);
}
class Add1{
	public static void m1(int x,int y) {
		System.out.println("Result:"+(x+y));
	}
}
public class MethodReference {

	public static void main(String[] args) {
		Calculator c1=(a,b)->{System.out.println("Result:"+(a+b));};
		c1.calculator(10, 20);
		
		Calculator c2=(a,b)->{Add1.m1(a,b);};  //do not create LE
		c2.calculator(10, 20);
		
		Calculator c3=Add1::m1; //Create Method Reference(Short-cut of LE creation)
		c3.calculator(10, 20);
		
		Wish wish1=wishMessage->System.out.println(wishMessage);
		wish1.wish("Good morning");
		
		Wish wish2=System.out::println;
		wish2 .wish("Bad morning");
		
		
		String data=
				"""
				Hi
				Hello
				how are you
				""";
		Stream<String> lines1=data.lines();
		lines1.forEach(line->System.out.println(line));
		System.out.println(".........................");
		
		Stream<String>lines2 =data.lines();
		lines2.forEach(System.out::println);
		System.out.println("...........................");
		


	}

}
@FunctionalInterface
interface Wish{
	void wish(String wishMessage);
}
