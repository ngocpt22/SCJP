package com.ngoc.collections.hashset.objects;

public class StudentsWithOverrideEqualAndHashCode {
	private String name;
	private int age;

	public StudentsWithOverrideEqualAndHashCode(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		int prime = 22041990;
		return prime + this.name.hashCode();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (object instanceof StudentsWithOverrideEqualAndHashCode) {
			StudentsWithOverrideEqualAndHashCode anotherStudent = (StudentsWithOverrideEqualAndHashCode) object;
			if (this.age == anotherStudent.age
					&& this.name.equals(anotherStudent.name)) {
				return true;
			}
		}

		return false;
	}

}
