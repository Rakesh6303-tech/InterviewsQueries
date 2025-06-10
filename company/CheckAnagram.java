package com.company;
import java.util.*;
public class CheckAnagram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		if(CheckAnagram(s1,s2))
		{
			System.out.print("Is Anagram");
		}
		else
		{
			System.out.println("Not an Anagram");
		}
	}
	static boolean CheckAnagram(String s1, String s2) {
		if(s1.length() != s2.length())
		{
			return false;
		}
		//  Convert Into Characters
		char [] array1 = s1.toCharArray();
		char [] array2 = s2.toCharArray();
		// Sort Them and store 
		Arrays.sort(array1);
		Arrays.sort(array2);
		// compares the sorted array
		return Arrays.equals(array1,array2);
	}

	
}
