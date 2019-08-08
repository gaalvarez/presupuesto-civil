/**
 * 
 */
package org.ucc.oop.tutorial;

/**
 * + Loops: ++ For ++ Foreach ++ Break and continue ++ While
 */
public class Loops {

	/**
	 * array.length array[i]
	 */
	public void run() {
		int[] array = { 1, 2, 3, 4, 5 };
		for (int i : array) {
			System.out.println(i);
		}
//		for (int i = 0; i < array.length; i++) {
//			System.out.println("i: " + array[i] * 2);
//		}
//		int j = 0;
//		while (j < array.length) {
//			System.out.println("j: " + array[j]);
//			j = j + 1; // increment j
//		}
	}

}
