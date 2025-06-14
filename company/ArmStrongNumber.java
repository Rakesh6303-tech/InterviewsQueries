package com.important;
import java.util.*;

public class MissingNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // n = total count including the missing number
        int ar[] = new int[n]; // Since one number is missing, array size is n-1

        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }

        System.out.println(MissingNumber(ar, n));
    }

    static int MissingNumber(int ar[], int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < ar.length; i++) {
            actualSum += ar[i];  // FIXED
        }
        return expectedSum-actualSum;
    }
}
