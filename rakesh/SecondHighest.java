package com.rakesh;
/*
 * Second Largest Element Data Structure
 */
import java.util.Scanner;

public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i<n; i++)
		{
			arr[i] = scan.nextInt();
		}
		int max1,max2;
        if(arr[0] > arr[1])
        {
        	max1 = arr[0];
        	max2 = arr[1];
        }
        else
        {
        	max1 = arr[1];
        	max2 = arr[0];
        }
        for(int i = 2; i<arr.length; i++)
        {
        	if(arr[i] > max1)
        	{
        		max2 = max1;
        		max1 = arr[i];
        	}
        	else if (arr[i] > max2)
        	{
        		max2 = arr[i];
        	}
        }
      //  System.out.println(max1);
        System.out.println(max2);
        
	}

}
