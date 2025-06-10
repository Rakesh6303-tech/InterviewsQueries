package com.company;
import java.util.*;
public class FrequencyChar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		Frequencycharacter(s);
	}
	static void Frequencycharacter(String s)
	{
		char [] charArray = s.toCharArray();
		boolean [] counted = new boolean[s.length()];
		for(int i=0;i<charArray.length;i++)
		{
			if(counted[i]) continue;
			int count=1;
			for(int j=i+1;j<charArray.length;j++)
			{
				if(charArray[i]==charArray[j])
				{
					count++;
					counted[j]=true;
				}
			}
		System.out.println(charArray[i]+"-"+count);
	}
	}

}
