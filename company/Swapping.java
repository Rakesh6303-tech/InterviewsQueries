package com.important;
/*
 * Swapping The Numbers without using Third Varaible
 */
import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {
		Scanner  scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Before Swapping: "+a+" "+ b);
		a = a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping: "+a+" "+ b);

}
}
