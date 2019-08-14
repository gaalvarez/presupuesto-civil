/**
 * 
 */
package org.ucc.oop.tutorial;

/**
 * Not all in JAVA are Objects.
 * 
 * + Primitives in Java:
 * ++ byte (number, 1 byte) => 8 bits => 2 elv 8 => 256 => -128 to 127
 * ++ short (number, 2 bytes)
 * ++ int (number, 4 bytes)
 * ++ long (number, 8 bytes)
 * ++ float (float number, 4 bytes)
 * ++ double (float number, 8 bytes)
 * ++ char (a character, 2 bytes)
 * ++ boolean (true or false, 1 byte)
 * ++ Local and Global variables
 *
 */
public class VariablesTypes {

	Long lonObject;
	
	public void run() {
		byte zero = 0;
		long lon = 5;
		double dou = 5.6;
		float flo = (float) 5.6;
		boolean bool = false;
		char car = 'w';
        String output = "W" + this.lonObject + "w";
        System.out.println(output);		
	}
	
}
