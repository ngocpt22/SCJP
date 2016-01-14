package com.ngoc.collections.hashset;

import java.util.HashSet;
import java.util.Set;

import com.ngoc.collections.hashset.objects.Students;
import com.ngoc.collections.hashset.objects.StudentsWithOverrideEqualAndHashCode;

public class AddingInSet {
	public static void main(String[] args) {
		Set<String> students = new HashSet<String>();
		students.add("N");
		students.add("Q");
		students.add("N");
		students.add("K");

		System.out.println(students);
		System.out.println();
		
		/*When using HashSet or LinkedHashSet, the objects you add to them must override hashCode(). 
		 * If they don’t override hashCode(), the default Object. 
		 * hashCode() method will allow multiple objects that you might consider "meaningfully equal" 
		 * to be added to your "no duplicates allowed" set. */
		
		/*Students doesn't override hashcode(), so that HashSet will display for all 4 Students object. 
		 * If you override hashCode() only, the result still has 4 object with 2 object addresses are the same 
		 * (ex: 2 objects com.ngoc.collections.hashset.objects.Students@659e0bfd and 
		 * 2 other objects com.ngoc.collections.hashset.objects.Students@2a139a55)*/		
		
		Set<Students> studentsObj = new HashSet<Students>();
		studentsObj.add(null);
		studentsObj.add(new Students("N", 25));
		studentsObj.add(new Students("Q", 21));
		studentsObj.add(null);
		studentsObj.add(new Students("Q", 21));
		studentsObj.add(new Students("N", 25));
		System.out.println(studentsObj);
		System.out.println();
		
		Set<StudentsWithOverrideEqualAndHashCode> studentsWithOverrideEqualAndHashCode = new HashSet<StudentsWithOverrideEqualAndHashCode>();
		studentsWithOverrideEqualAndHashCode.add(new StudentsWithOverrideEqualAndHashCode("N", 25));
		studentsWithOverrideEqualAndHashCode.add(new StudentsWithOverrideEqualAndHashCode("Q", 21));
		studentsWithOverrideEqualAndHashCode.add(new StudentsWithOverrideEqualAndHashCode("Q", 21));
		studentsWithOverrideEqualAndHashCode.add(new StudentsWithOverrideEqualAndHashCode("N", 25));
		System.out.println(studentsWithOverrideEqualAndHashCode);
	}
}
