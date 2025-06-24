package com.subodh.new_features;
/*
 * A method can take only one type of value a argument to pass differnet types of values
 * 		1.Method overloading
 * 		2.Method with highest range or super type Parameter(Loose coupling)
 */

public class Generics {

	public static void main(String[] args) {
		//1:----Method OverLoading----[we must define multiple method ,program becomes static]
		A1 a1=new A1();
		a1.m1(5);
		a1.m1(5.0);
		//#2:With Highest range data type as parameter[All Lower range data type are converted 
		//to Higher Range data type values]
		A2 a2=new A2();
		a2.m1(5);
		a2.m1('a');
		//b1.m1(true);
		System.out.println(".........");
		
		A3 a3=new A3();
		a3.m1("s");
		//c1.m1(5);
		System.out.println("............");
		
		A4 a4=new A4();
		a4.m1("s");
		a4.m1(5);
		//a4.m1(5.0);
		System.out.println("............");
//===================================================		
		A5 a5=new A5(); //For the first object a5 I want to allow all types objects to pass
		a5.m1("a");
		a5.m1(5);
		a5.m1(10.5);
		a5.m1(true);
		a5.m1(new A1());
//======================================================		
	//The problem with MOVL or Super type parameter 
	//We can not pass particular one type of objects as one argument 	
	//Dynamically based on the current object
		
		A5 a6=new A5();	//for the 2nd object ,i want to pass only Integers
		A5 a7=new A5();	//for the 2nd object ,i want to pass only Strings
		A5 a8=new A5();	//for the 2nd object ,i want to pass only Students
//==================================================================================
		
		B<Integer> b1=new B<>();//I want pass only Integers
		b1.m1(3);
		
		B<String> b2=new B<>();//I want pass only Strings
		b2.m1("s");
		
		B<Student> b3=new B<>();//I want pass only Students
		b3.m1(new Student(  ));
//====================================================================
		B.m2(5);
		
	}

}
/*
 * It is a java 5 new Feature
 * This feature is meant for providing Compile time safety
 * It means it is used for providing type information to a compiler
 * 
 * We do not want to fix the method parameter at method definition time
 * we want to fix method parameter at method calling time
 * then we must create this method with generic parameter at shown below
 * 
 * The commonly used generic parameter name names are
 * 		T->Type (Parameter 1)
 * 		U->Type (Parameter 2)
 * 		R->Return type
 * 		E->Element
 * 		K->Key
 * 		v->Value	
 * Basically generics concept used for creating collection  class
 */		
class B<Type>{ //Generic Parameter Class
	void m1(Type i) {
		System.out.println(i.getClass().getSimpleName()+"type value passed..");
	}
	static <T> void m2(T t) {// Static Generic  method
		System.out.println(t.getClass().getSimpleName()+"type value passed..");
	}
}
class A1{
	void m1(int i) {
		System.out.println(i);
	}
	void m1(double i) {
		System.out.println(i);
	}
}

class A2{
	 void m1(double d) {
		 System.out.println(d);
	 }
}
class A3{
	void m1(String s) {
		System.out.println(s);
	}
}
class A4{
	void m1(String s) {
		System.out.println(s);
	}
	void m1(Integer i) {
		System.out.println(i);
	}
}

class A5{
	void m1 (Object obj) {
		System.out.println(obj);
	}
}




