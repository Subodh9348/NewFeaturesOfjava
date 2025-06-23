package com.subodh.new_features;

import java.util.ArrayList;

/*
 * complete note in volume #1A text book wrapper classes chapter
 * 	PDT									Wrapper	classes
 * ......								...............
 * 	byte 									byte---------------------
 *	short									Short--------------------
 *	int										Integer------------------
 *	long									Long---------------------	}->Number->object
 * 	float									Float--------------------			  /
 * 	double									Double-------------------			 /
 * 	char									Character--------------------------	/
 * 	boolean									Boolean----------------------------/		
 * 
 * 	void									void
 * 
 * ============================================================
 * Q:What are the different operations we can perform by using WCs?
 * 	#1:PV -> WCO =>constructor(PDT) and static valueof(PDT)
 * 	#2:WCO->PV	 =>xxx value
 * 	#3:PV->WCO	 =>Constructor(String) and Static valueof(String)
 * 	#4:PSO->PV	 =>state parsexxx(String) 
 * 	#5:WCO->PSO  =>Object.toString() [@overridden in all WCs to return State of this object]
 * 	#6:PV->PSO	 =>Static toString(PDT) [OWN method of WCS]
 * 
 * Q:Are Wrapper class  
 */

public class AutoboxingAndAutounbxing {

	public static void main(String[] args) {
		//1#.PDT->WCO [50->Integer(50)]
		int i1=50;				//primitive data type(PDT) value object
		Integer io1=new Integer(50);//PDT value as object
		Integer io2=Integer.valueOf(50);//PDT value as object
		
		long l1=934835634L;			//PDT value
		Long lo1=new Long(934835634L);//PDT value as object  
		Long lo2=Long.valueOf(934835634L);//PDT value as object
		
		//2. WCO->PDT->[Integer(50)->50]
		Integer  io3=new Integer(50);//PDT value as object
		int      i3=io3.intValue();//PDT value
		
		Long lo3=new Long(934835634L);//PDT value as object
		long  l3=lo3.longValue();
		
		//#3.Primituve String Object ->WCO["50"->Integer(50)]
		Integer  io4=new Integer("50");//pso as Wco
		Integer  io5=Integer.valueOf("50");//PSO as WCO
		int      i5=io5.intValue();
		
		//#4.PSv->PV
		int      i6=Integer.parseInt("50");
		long	 l6=Long.parseLong("898939439");
		double   d6=Double.parseDouble("10.5");
		
		//#5.WCO->PSO
		Integer  io7=Integer.valueOf("50");//PSO as WCO
		Long     lo7=Long.valueOf(303039390L);
		String   si7=io7.toString();
		String   sl7=lo7.toString();
		
		//#6.PV->PSO
		String   si8=Integer.toString(50);
		String   sl8=Long.toString(301200393L);
		String   sd8=Double.toString(10.5);
		
		//compatibility
			Integer io8=new Integer(50);
			//Long  lo8=io8;
			
		//Comparision->==Operator and equals() method(Overridden in all Wcs)
			Integer io9=new Integer(50);
			Integer io10=new Integer(50);
			System.out.println(io9);				//false(different reference)
			System.out.println(io9.equals(io10));	//true[same state]	
		//Q.for AB why valueOf(0) is being used why not new kw and constructor?
			//for developing object pooling and for decreasing number of objects creation
		Integer i11=new Integer(50);
		Integer i12=new Integer(50);
		System.out.println(i11==i12);
		
		Integer i13=Integer.valueOf(50);
 		Integer i14=Integer.valueOf(50);
		System.out.println(i13==i14);
		
		Integer io15=new Integer(100);
		Integer io16=Integer.valueOf(100);
		System.out.println(io15==io16);
		System.out.println(".........................");
		//..........Pooling is applied only for byte range Integers and to be boolean...............................
		
		Integer io17=50;
		Integer io18=50;
		System.out.println(io17==io18);
		
		Integer io19=127;
		Integer io20=127;
		System.out.println(io19==io20);
		
		Integer io21=128;
		Integer io22=128;
		System.out.println(io21==io22);
		//=====================================================
		/*
		 * AB is done means WCO is created based on the assigned value here assigned value 
		 * is 50 so compiler creates integer object we can not assign integer object to long
		 * so. CE
		 * 
		 * Long lo25=50;
		 * Double do25=50;
		 * Note:
		 * 		Int to long possible Integer to long not possible
		 * 
		 */
		long lo25=50; //CE:long lo25=Integer.valueOf(50);
		double do25=50;
		
		//Q.Why AB and AUB?
		//The correct answer is for simplifying collection code
		//collection accepts every this as object
		
		//1.4 based code boxing and unboxing
		
		ArrayList a1=new ArrayList();
		a1.add(new Integer(10));
		a1.add(new Integer(20));			//boxing
		a1.add(new Double(20.5));
		a1.add(new Character('a'));
		a1.add(new Boolean(true));
		
		Object obj=a1.get(1);
		Integer io26=(Integer)obj;			//unboxing
		int i26=io1.intValue();
		//======================================
		//................java 5 based with Auto Boxing and Auto Unboxing................
		ArrayList a12=new ArrayList();
		a1.add(10);
		a1.add(20);			// Auto boxing
		a1.add(20.5);
		a1.add('a');
		a1.add(true);
		
		obj=a1.get(1);
		int i27=((Integer)obj);	//Auto unboxing
		
		
		
		
		
			
			
		
		
	}
	static void m1(Object obj) {
		
	}
	static Object m2() {
		return null;
	}

}
