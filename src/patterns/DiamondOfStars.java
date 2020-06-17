package patterns;

import java.util.Scanner;

public class DiamondOfStars {
		 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=(n/2)+1)
        {	
            int space = 1;
            while(space<=(n/2)+1-i)
            {
                System.out.print(" ");
                space++;
            }
            int j = 1;
            while(j<=((i*2)-1))
            {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        int x = (n/2);
        while(x>0)
        {	
            int space = 1;
            while(space<=(n/2)+1-x)
            {
                System.out.print(" ");
                space++;
            }
            int k = 1;
            while(k<=x*2-1)
            {
                System.out.print("*");
                k++;
            }
            System.out.println();
            x--;
        }
        sc.close();
	}


}

