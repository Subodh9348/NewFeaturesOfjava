package com.subodh.new_features;
interface Mno{
	public abstract void m1();
	public abstract void m2();
	
	public static void m3() {
		m7();
	}
	public static void m4() {
		m7();
	}
	
	public default void m5() {
		m8();
	}
	public default void m6() {
		m8();
	}
	
	private static void m7() {
		
	}
	private void m8() {
		
	}
	
}

public class PrivateMethod_In_Interface {

	public static void main(String[] args) {
		
	}

}
