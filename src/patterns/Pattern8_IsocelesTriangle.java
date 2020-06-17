package patterns;

import java.util.Scanner;

public class Pattern8_IsocelesTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int i = 1;
		while(i<=n)
		{
			int space = n-i;
			while(space>=1)
			{
				System.out.print(" ");
				space--;
			}
			int j = 1;
			while(j<=i)
			{
				System.out.print(j);
				j++;
			}
			int k = i-1;
			while(k>=1)
			{
				System.out.print(k);
				k--;
			}
			System.out.println();
			i++;
		}
	}

}
