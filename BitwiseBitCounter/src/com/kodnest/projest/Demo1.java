package com.kodnest.projest;

import java.util.Scanner;

public class Demo1 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int num = scanner.nextInt();
	        scanner.close();

	       int set= CountSetBits.countSetBits(num);
	        System.out.println("Number of set bits in " + num + " is "+ set );
	  }
}
