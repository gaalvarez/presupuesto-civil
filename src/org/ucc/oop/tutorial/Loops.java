/**
 * 
 */
package org.ucc.oop.tutorial;

/**
 * + Loops: 
 * ++ For 
 * ++ Foreach 
 * ++ Break and continue 
 * ++ While
 */
public class Loops {

	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("i: " + i);
		}
		int j = 0;
		while (j < 3) {
			System.out.println("j: " + j);
			j = j + 1; //increment j
		}
	}

}
