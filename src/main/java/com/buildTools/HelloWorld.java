package com.buildTools;

import java.util.Scanner;

/**
 * @author psukalka
 *
 */
public class HelloWorld {

	public final void greetings() {
		Scanner input = new Scanner(System.in);
		String viewer = input.next();
		System.out.println("Hello " + viewer);
	}
}
