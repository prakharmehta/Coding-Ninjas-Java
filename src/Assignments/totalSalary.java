package Assignments;

import java.util.Scanner;

public class totalSalary {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        long basic = sc.nextInt();
        char grade = sc.next().charAt(0);
        double hra = 0.2*basic;
        double da = 0.5*basic;
        double allow;
        double pf = 0.11*basic;
        if(grade == 'A')
        {
            allow = 1700;
        }
        else if(grade == 'B')
        {
            allow = 1500;
        }
        else
        {
            allow = 1300;
        }
        double totalSalary = basic + hra + da + allow - pf;
        System.out.print(totalSalary);     
		sc.close();
	}
}
