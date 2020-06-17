package patterns;

import java.util.Scanner;

public class Pattern {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
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
            int val = i;
            while(j<=i)
            {
                System.out.print(val);
                j++;
                val++;
            }
            System.out.println();
            i++;
        }
		sc.close();
	}

}

