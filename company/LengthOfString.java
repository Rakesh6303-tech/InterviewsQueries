package com.imp;
import java.util.*;
public class LengthString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		LengthString(s);
	}
	static void LengthString(String s)
	{
		int i=0;
		try {
			while(true)//keep the loop running until an exception occurs
			{
				s.charAt(i);
				i++;
			}
		}
		catch(Exception e)
		{
			System.out.println(i);
		}
	}

}
