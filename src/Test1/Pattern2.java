package Test1;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int colLimit = 2*n+1;
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<colLimit/2; j++)
            {	
                if(j==i)
                {
                    System.out.print("*");
                }
                else
                    System.out.print("0");
            }
            System.out.print("*");
            for(int j = (colLimit/2)+1; j<colLimit; j++)
            {
                if(j==colLimit-i-1)
                    {
                    System.out.print("*");
                }
                else
                    System.out.print("0");
            }
            System.out.println();
	}
        
	}

}
