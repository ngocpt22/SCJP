package com.ngoc.generics.tutorialspoint;

/**
 * The class name is followed by a type parameter eg: <T> below
 * 
 * @author ptngoc
 * @param <T>
 */
public class GenericClassTest<T> {
	private T t;

	public GenericClassTest(T t) {
		this.setT(t);
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public static void main(String[] args) {
		GenericClassTest<Integer> gInt = new GenericClassTest<Integer>(10);
		System.out.println(gInt.getT());

		GenericClassTest<String> gStr = new GenericClassTest<String>("N");
		System.out.println(gStr.getT());
	}
}
