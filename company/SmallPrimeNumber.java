package com.imp;

public class SmallestPrime {

	public static void main(String[] args) {
		int ar [] = {41,3,8,9,12,85,69};
		int min = Integer.MAX_VALUE; //  -->For Smaller Prime Number Finding
	//	int min = Integer.MIN_VALUE;   --> FOR Larger Prime Number Finding
		for(int i=0;i<ar.length;i++)
		{
			if(isprime(ar[i]))
			{
				if(ar[i]<min)     // if(ar[i]>min)-----> For Finding Larger Prime Number 
				{
					min =ar[i];
				}
			}
		}
		System.out.println(min);
	}
	
	
	static boolean isprime(int n)
	{
		if(n<2) return false;
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;		
	}
}
