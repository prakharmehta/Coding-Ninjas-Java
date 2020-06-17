package Assignments;

import java.util.Scanner;

public class checkNumberSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc .nextInt();
        int b = sc.nextInt();
        int isDec = 1;
        if(a<b)
        {
            isDec = 0;
        }
        else if(a>b)
        {
            isDec = 1;
        }
        else if(a == b)
        {
            System.out.println("false");
            return;
		}
        
        for(int i = 1; i<n-1; i++)
        {	
            a = b;
            b = sc.nextInt();
            if (a == b)
            {
                System.out.println("false");
                return;
            }
            else if(isDec == 0 && a>b)
            {
                System.out.println("false");
                return;
            }
            else if(isDec == 1 && b>a)
            {
                isDec = 0;
            }
        }
        System.out.println("true");
	}

}
