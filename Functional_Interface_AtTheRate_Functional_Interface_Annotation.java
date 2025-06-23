package com.subodh.new_features;

/*
 * 1.marker interface (Empty Interface)
 * fot only providing type to its implementation class to consider it as special type of 
 * object to provide permission for executing some special logic 
 * For Example:Serializable is a  marker  interface 
 * for executing Serializable logic
 */
interface I1A{		
	void m1();
}
/*
 * 2.Functional inteface(SAM)
 * 	For enabling functional programming in java,for storing or passing or returning
 * a function or a logic directly as argument without creating extra class and object
 */
interface I2A{
	void m1();
}
/*
 * 3.Business interface(more than one abstract method)
 * for represting the main type of an object by declaring its operation for forcing to implement
 * its implementation classes developer
 */
interface I3{
	void m1();
	void m2();
}

@FunctionalInterface
interface I4{			//i want Functional interface,so its have only one Abstract method(AM)
	void m1();			//how to prove it?
	//void m2();
}

@FunctionalInterface
interface I5{			//One AM+ 'n' number of DM,SM,PM are allowed
	void m1();
	default void m3() { }
	default void m4() { }
	static void m5() { }
	static void m6() { }
	private static void m7() { }
	private void m8() { }
}

@FunctionalInterface
interface I6{		//this method can take only integer as argument
	void m1(int a);	//How can we pass double/long/boolean/String/Student?
}					//can we overload this method in this interface?
					//Noo,because it is FI,SAM interface
					//Create Generic FI

@FunctionalInterface
interface I7<T>{	//we can pass all types of values
	void m1(T t);	//based on the instance specific
}

@FunctionalInterface
interface I8<T,U>{	
	void m1(T t,U u);	
}

@FunctionalInterface
interface I9<T>{	
	void m1(T... t);	
}

@FunctionalInterface
interface I10<T>{	
	T m1();	
}

@FunctionalInterface
interface I11<T,R>{	
	R m1(T t);	
}

public class Functional_Interface_AtTheRate_Functional_Interface_Annotation {

	public static void main(String[] args) {
		

	}

}
