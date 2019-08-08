package org.ucc.oop;

import java.text.ParseException;

import org.ucc.oop.tutorial.Loops;
import org.ucc.oop.tutorial.Practices;
import org.ucc.oop.tutorial.Student;

/**
 *</p>
 * Learn the Basics
 * x Hello, World!
 * x Variables and Types
 * + Conditionals
 * + Arrays
 * + Loops
 * + Functions
 * + Practice
 */
public class Main {

	public static void main(String[] args) {
		Student student = new Student("Angela", "Lara", 22);
		System.out.println(student.presentation(false));
	}
}
