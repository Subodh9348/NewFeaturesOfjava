package com.subodh.new_features;
//Upto java 7v inside interface we can create only below 3 members
		//1.public static final fields
		//2.public abstract methods
		//3.public static inner classes
	
	//From java 8v inside interface we can also create
		//4.public default implements method
		//5.public static implemets method
	
	//from java 9v inside interface we can also create 
		//6.private static implemets method
		//7.private non-static implemented method

//Default implemented method	
/*
 * The Default method is a java 8v new feature
 * it Is an interface Method which contsins default implementation
 * 
 * A method that has implementation body in interface with the keyword
 * 'default' is called default method
 * 
 * It is used for creating new methods in interface without  forcing implementation classes to
 * implementation classes to implement those methods.
 * 
 *  From java 8v onwards interface we can create 
 *  	1.we can create A method without body that is abstract method to force 
 *  		implemetation classes to implement it.
 *  	2.We can create a method with body that is public default implemented method with out forcing implementation 
 *  		classes to implement it.
 *  
 * 	What is the differnece of Abstract class and Java 8v Interface?
 * 		Same difference still we have
 * 
 * 		1.java 8v interface still can not have constructor,can not instantiated
 * 			either directly or via implementation class
 * 
 * 		2.java 8v interface still supports multiple type inheritance even though
 *        implemetation method.
 *      
 * For creating default method we must use 'default' keyword (Modifier)
 * public default<RT> <mN> (<PL>) <throws EL>{
 * 				-------
 * 				-------
 * 				------- logic		
 *         }
 * 			public is optional compiler will add it
 * 			-Default is mandatory,else compiler throws error
 * 
 * 		sample program
 */
interface P{
	void m1() ;
	default void m2() {
		System.out.println("interface default method from interface P");
	}
}
class Q implements P{
	public void m1() {
		System.out.println("Abstaract method from class Q");
	}
}
class R implements P{
	public void m1() {
		System.out.println("Abstaract method from class R");
	}
}
class S implements P{
	public void m1() {
		System.out.println("Abstaract method from class S");
	}
}

public class DefaultMethod {

	public static void main(String[] args) {
		//execute(new Q());
		P p1;
		//p1=new P();//CE: P is abstract;can not be instantiated
		p1=new Q();
		p1.m1();
		p1.m2();
		System.out.println("....................");
		
		p1=new R();
		p1.m1();
		p1.m2();
		System.out.println("....................");
		
		p1=new S();
		p1.m1();
		p1.m2();
		System.out.println("....................");
		
		p1=new T();
		p1.m1();
		p1.m2();
		System.out.println("....................");
		
		p1=new U();
		p1.m1();
		p1.m2();
		System.out.println("....................");
		
		Ex e1=new Ex();
		e1.m1();
		e1.m2();
		System.out.println("....................");
		
		Sa e2=new Sa();
		e2.m1();
		e2.m2();
		System.out.println("....................");
	}
//	static void execute(P p) { //Loose coupling
//		//p.m1();					//Runtime Polymorphism
//		//p.m2();
//	}

}
class T implements P{

	@Override
	public void m1() {
		System.out.println("interface abstract method from class T");
		
	}

	@Override
	public void m2() {
		System.out.println("interface default implemented method from class T");
	}
	
}
//Extending default method [executing logic from interface and its implemented class
class U implements P{

	@Override
	public void m1() {
		System.out.println("interface abstract method from class U");
		
	}

	@Override
	public void m2() {
		P.super.m2();
		System.out.println("interface default implemented method from class U");
	}
	
}
//How this default method does not create CE:Ambigious error in MI?
interface I1{
	void m1();
	default void m2() {
		System.out.println("DEfault method m2 from Interface I1");
	}
}

interface I2{
	void m1();
	default void m2() {
		System.out.println("DEfault method m2 from interface I2");
	}
}
/*class Example implements I1,I2{
	public void m1() {				//CE:AE from default method
		
	}
}*/

class Ex implements I1,I2{
	public void m1() {				//solution:override DM in implementation class
		System.out.println("Am executed from class EX ");
	}
	public void m2() {
		System.out.println("Am executed from class Ex");
	}
}
//how can we execute DM implementation from interfaces?

class Sa implements I1,I2{
	public void m1() {				//call by using
									//interfacename.super.m1();		
			System.out.println("Am executed from class sa ");						
	}
	public void m2() {
		System.out.println("Dm executed from class SA");
		I1.super.m2();
		I2.super.m2();
	}
}





















