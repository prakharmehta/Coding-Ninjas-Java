package patterns;

import java.util.Scanner;

public class Pattern9_TriangleOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt();
		        int i = 1;
		        while(i<=n)
		        {	
		            int space = 1;
		            while(space<=n-i)
		            {
		                System.out.print(" ");
		                space++;
		            }
		            int j = 1;
		            int counter = i;
		            while(j<=i)
		            {
		                System.out.print(counter);
		                counter++;
		                j++;
		            }
		            int k = 1;
		            int counter1 = 2*(i-1);
		            while(k<=i-1)
		            {
		                System.out.print(counter1);
		                counter1--;
		                k++;
		            }
		            System.out.println();
		            i++;
		        }
		        sc.close();
			}
}
