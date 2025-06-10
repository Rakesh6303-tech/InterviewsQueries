package com.company;
import java.util.*;
public class OccurenceOfNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] =  new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		Arrays.sort(ar); 
		Frequencycharacter(ar);
	}
	static void Frequencycharacter(int ar [])
	{
		int count=1;
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]==ar[i+1])
				{
					count++;
				}
				else {
					System.out.println(ar[i]+"-"+count);
				    count=1;
				}	
		}
		// For Last Element
		System.out.println(ar[ar.length-1]+"-"+count);
		}
	}

