package com.rakesh;

import java.util.Scanner;

public class BiogramTriogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new Scanner(System.in).nextLine();
		String arr[] = str.split("[,. ]");
		for(int i = 0; i<=arr.length-2; i++)
		{
			for(int j = i; j<i+2; j++)
			{
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
	
	}

}
