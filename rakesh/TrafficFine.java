package com.rakesh;

import java.util.Scanner;

public class TrafficFine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int speed = new Scanner(System.in).nextInt();
		int fine = 0;
	 if(speed > 10 && speed <=15)
		{
			fine = 100;
		}
		else if(speed >15 && speed <= 25)
		{
			fine = 200;
		}
		else
		{
			fine = 300;
		}
		int actualfine = fine-(5*(fine/75));
		System.out.println(actualfine);

	}

}
