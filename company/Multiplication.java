package com.imp;
import java.util.*;
// Perform Multiplication Without Using * Operator
public class Multiplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		Multiplication(m,n);
	}
	static void Multiplication(int m,int n)
	{
		int res = 0;
		for(int i=0;i<Math.abs(n);i++)  // N value loop Codition
		{
			res = res + m;       // m value be adding upto for loop terminate
			
		}
		System.out.println(res);
		
	}

}
