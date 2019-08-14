package org.ucc.oop;

import org.ucc.oop.tutorial.Student;

/**
 * 1.
Student pepito = new Student("Pepito", "Perez", 22);
		Student pepito2 = new Student("Pepito", "Perez", 22);
		Student pablito = new Student("Pablito", "Paez", 25);
		System.out.println(pepito == pepito2);
		System.out.println(pepito.equals(pepito2));
		System.out.println(pepito == pablito);
		pablito = pepito;
		System.out.println(pepito == pablito);
 *2. 
 *short s = 129;
		byte b = (byte) s;
		System.out.println(b);	
		
		
 */
public class Main {

	public static void main(String[] args) {
		Student pepito = new Student("Pepito", "Perez", 22);
		modificar(pepito);
		System.out.println(pepito.presentation(false));	
	}
	
	public static void modificar(Student student) {
//		student = new Student("Pablito", "Paez", 28);
		student.setName("Pablito");
		student.setLastName("Paez");
		student.setAge(28);
	}
}
