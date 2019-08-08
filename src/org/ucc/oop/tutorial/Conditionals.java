/**
 * 
 */
package org.ucc.oop.tutorial;

/**
 * + Conditionals:
 * ++ Boolean operators
 * ++ If - else sentence
 * ++ Java ternary operator
 * ++ == and Equals  
 */
public class Conditionals {

	public void run() {
		String a = new String("Wow");
		String b = new String("Wow");
		String as = a;
		System.out.println(a == b);//true | false
		System.out.println(a.equals(b));//true | true
		System.out.println(a == as);//true | true
	}
}
