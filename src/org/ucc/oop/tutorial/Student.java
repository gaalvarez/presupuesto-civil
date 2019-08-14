/**
 * 
 */
package org.ucc.oop.tutorial;

/**
 * @author iotec_ceo
 *
 */
public class Student {


	private String name;
	private String lastName;
	private int age;
	
	
	public Student(String name, String lastName, int age) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}

	public String presentation(boolean shortPresentation) {
		if (shortPresentation) {
			return "My name is " + name;
		} else {
			return "My name is " + name + " " + lastName + "\n" + " I am " + age + " years old";
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean equals(Student other) {
		if (!this.name.equals(other.getName())) {
        	return false; 
		}
		if (!this.lastName.equals(other.getLastName())) {
        	return false; 
		}
		if (this.age != other.getAge()) {
        	return false; 
		}
		return true;
    }
}
