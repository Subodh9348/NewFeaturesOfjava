package com.subodh.new_features;
/**
 * Old version upto jav 1.0v to 7v by using outer class
interface Addition{
	void add(int a,int b);
}

class AdditionImpl implements Addition{
	public void add(int a,int b) {
		System.out.println(a+b);
	}
}
public class LambdaExpression {

	public static void main(String[] args) {
		Addition a=new AdditionImpl();
		a.add(10, 20);
	}

}*/
//new version from  java 8v Lamba expression
//A LE is a anonymous function
//it is used for implementing one functional interface
//A LE has two parts connected by->(lambda operator)
//  1.parameters
//	2.body with or without logic

//Syntax 
// 1.for storing in  FI variable
//   FI fi=(params)->{logic};

// 2.passing lE as argument to amethod
//   void m1(FI fi) {}    		//method definition
//   m1((params)->{logic});		//method calling with LE


//3.returing LE from a method
//		FI m2(){
//				return (params)->{logic};
//			}
interface Addition{
	void add(int a,int b);
}

//public class LambdaExpression {
//
//	public static void main(String[] args) { //
//		Addition a=new Addition() {
//					public void add(int a,int b) {
//						System.out.println("From AIC result:"+(a+b));
//					}
//		};
//		a.add(10, 20);
//	}
//}
public class LambdaExpression {

	public static void main(String[] args) { //
		//lambda expression (2 parts [params->body]
		//-> is called lambda operator
		System.out.println("main start");
						//LE (short cut way of creating AIC)
		Addition a1=
				(x,y)->System.out.println("From AIC result:"+(x+y));
				
		a1.add(10, 20); //comment it to check whether LE is executed or not
		System.out.println("main end");
		}
	}







