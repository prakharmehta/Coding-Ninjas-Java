package Assignments;

import java.util.Scanner;

public class OddEvenSum {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
        int even = 0;
        int odd = 0;
        while(n>0)
        {
        	int digit = n%10;
            if(n%2==0)
            {
                even+=digit;
            }
            else
            {
                odd+=digit;
            }
            n=n/10;
        }
        System.out.print(even + " ");
        System.out.print(odd);
	}
}