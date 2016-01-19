package com.ngoc.collections.polymorphic.array;

public class ArraySuperTypeParameter {

	public void foo() {
		Dog[] cats = { new Dog(), new Dog() };
		addAnimal(cats);
	}

	public void addAnimal(IAnimal[] animals) {
		animals[0] = new Husky(); // OK with added a subtype of Dog
		System.out.println(animals[0]);

		animals[1] = new Cat(); /* run time exception here -
								 java.lang.ArrayStoreException - cause you add
								 a dog into a cat array*/
		System.out.println(animals[1]);
	}

	public static void main(String[] args) {
		new ArraySuperTypeParameter().foo();
	}

}
