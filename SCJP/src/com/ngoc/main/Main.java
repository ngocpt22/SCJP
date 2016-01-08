package com.ngoc.main;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("v2");
		System.out.println("v3");
		//== 2 objects are null
		EqualTesting n = null;
		EqualTesting q = null;
		System.out.println(n == q);
		//TODO:failed cause n = null
		/*System.out.println(n.equals(q));*/
		
		//TODO: FAILED: FALSE?
		EqualTesting n1 = new EqualTesting();
		n1.setN("N");
		n1.setQ("Q");
		n1.setY(10);
		EqualTesting n2 = new EqualTesting();
		n2.setN("N");
		n2.setQ("Q");
		n2.setY(10);
		
		System.out.println(n1.equals(n2));
		
		// True causes String and Wrapper class have overridden the equals()
		Integer nn1 = new Integer(1000);
		Integer nn2 = new Integer(1000);
		System.out.println(nn1.equals(nn2));
		
		int i1 = 1000;
		int i2 = 1000;
		System.out.println(i1 == i2);
		
		// reflexive
		System.out.println(n1.equals(n1));
		
	}
}
