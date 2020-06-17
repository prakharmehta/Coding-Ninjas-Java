package Assignments;

import java.util.Scanner;

public class PowerOfANumber {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        int result = x;
        int i = n;
		if(n==1)
        {
            System.out.println(result);
            return;
        }
        else if(n==0)
        {
            System.out.println(1);
            return;
        }
        else
        {
		while(i>1)
        {
			result = result * x;
            i--;
        }
        }
        System.out.print(result);

	}

}
