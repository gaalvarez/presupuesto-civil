/**
 * 
 */
package org.ucc.oop.tutorial;

/**
 * + Practice
 * ++ Frame decoder
 * 
 * A gps device send strings frames whit below format:
 * 
 * $dd-mm-aaaa hh:mm:ss;lat;lng;speed;course;id-device$
 * 
 * Examples:
 * 
 * $06-08-2019 05:05:10;2.456476;-76.591452;35;350;SPL001$
 * $06-08-2019 05:10:10;2.456994;-76.591731;40;352;SPL001$
 * $06-08-2019 05:15:10;2.457787;-76.592219;42;353;SPL001$
 * $06-08-2019 05:20:10;2.458623;-76.592766;41;355;SPL001$
 * $06-08-2019 05:25:10;2.459175;-76.593077;2;300;SPL001$
 * 
 * Use previous concepts to develop a program what decode frame.
 * Put all section information in a variable whit correct type.
 * Print results then.
 * 
 * Helps:
 * 
 * ++ split(regex): return the array of strings computed by splitting this string
 * around matches of the given regular expression.
 * 
 * The string "boo:and:foo", for example, 
 * yields the following results with these expressions:
	Regex	Result
	  :		{ "boo", "and", "foo" }
	
 * 
 */
public class Practices {

	private String frame = "$06-08-2019 05:05:10;2.456476;-76.591452;35;350;SPL001$";
	
	public void run() {
		// put your code here
	}
	
}
