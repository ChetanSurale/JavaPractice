package com.javapractice.immutableclass;

/*
 * 
 * @Auther : Chetan Surale
 * 
 * */

/*
How Do We Create an Immutable Class
In order to create an immutable class, you should follow the below steps:

1. Make your class final, so that no other classes can extend it.

2. Make all your fields final, so that they’re initialized only once inside the constructor and never modified afterward.

3. Don’t expose setter methods.

4. When exposing methods which modify the state of the class, you must always return a new instance of the class.

5. If the class holds a mutable object:
	Inside the constructor, make sure to use a clone copy of the passed argument and never set your mutable field to the real instance passed through constructor, this is to prevent the clients who pass the object from modifying it afterwards.
	Make sure to always return a clone copy of the field and never return the real object instance.

*/

//  Make your class final, so that no other classes can extend it.
public final class ImmutableStudent {

	// Make all your fields final, so that they’re initialized only once inside the
	// constructor and never modified afterward.
	private final int id;
	private final String name;
	private final Age age;

	public ImmutableStudent(int id, String name, Age age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}

	// Don’t expose setter methods.
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Age getAge() {
		Age cloneAge = new Age();
		cloneAge.setDay(this.age.getDay());
		cloneAge.setMonth(this.age.getMonth());
		cloneAge.setYear(this.age.getYear());
		return cloneAge;
	}

	public static void main(String[] args) {
		Age age = new Age();
		age.setDay(4);
		age.setMonth(7);
		age.setYear(1993);
		
		ImmutableStudent student = new ImmutableStudent(1, "Chetan", age);
		System.out.println("Chetan age year before modification = " + student.getAge().getYear());
		
		student.getAge().setYear(1995);
		System.out.println("Chetan age year after modification = " + student.getAge().getYear());
	}

}
