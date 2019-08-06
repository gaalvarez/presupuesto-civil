/**
 * 
 */
package org.ucc.oop.tutorial;

/**
 * + Functions: 
 * ++ Function structure 
 * ++ Static and no static functions
 * ++ constructor
 */
public class Functions {
	
	public void run() {
		this.otherFunction();
	}

	private void otherFunction() {
		System.out.println("Other function");
	}
	
	private void otherFunction(String msg) {
		System.out.println(msg);
	}
	
	private String otherFunctionReturn() {
		return "Other function";
	}
	
}
