package com.ngoc.generics.tutorialspoint;

public class MaximumTest {
	public static <T extends Comparable<T>> T max3Numbers(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		// System.out.printf("Max number of %d, %d, %d is: %d \n", x, y, z, max);
		System.out.println("Max number:" + max);

		return max;
	}

	public static void main(String[] args) {
		max3Numbers(10.2, 5.7, 2.1);
		max3Numbers(10, 5, 2);
		max3Numbers(9L, 11L, 1L);
		max3Numbers('N', 'Q', 'K');
	}
}