package com.imp;
// This Question Asked in the 42 Gears Technical 1 Interview
public class ZerosWillBeLast {

	public static void main(String[] args) {
		int ar [] = {0,1,0,4,0,5,6,7,0,8,0};
		int index=0; //should keep track where non zero number should be placed
		for(int num:ar)  // 
		{
			if(num!=0)  // If Non Zero Elements
			{
				ar[index]=num;  // That Value Placed at ar[index]
				             // Ex; ar[0]=1, ar[1]=1, ar[2]=2,  like this
				index++;     // Index will be Incremented
			}
		}//This loop fills the rest of the array from index to the end with 0s.
		while(index<ar.length)
		{
			ar[index]=0;  // Zeros in the array index which is continued from the intial stage
			             // ar[6] =0, ar[7]= 0, like this way the values of zeros elements will be stored at the end
			index++;
		}
		for(int num:ar)    // Print All Elements so We used this ForEach Loop 
		{
			System.out.print(num+" ");  
		}

	}

}
