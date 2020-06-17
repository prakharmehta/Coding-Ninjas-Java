package test2;

import java.util.Scanner;

public class LeadersInArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++){
			input[i] = s.nextInt();
		}
		leaders(input);		
	}
	
	public static void leaders(int[] input) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
        String leaders = "";
		int x = 0;
        int leader = Integer.MIN_VALUE;
        for(int i = 0; i<input.length; i++)
        {
            for(int j = input.length - 1; j>=i; j--)
            {
                if(input[j] <= input[i])
                {
                    x = 0;
                }
                else
                {
                    x++;
                    break;
                }
            }
            if(x == 0)
            {	
                leader = input[i];
                leaders+=String.valueOf(leader) + " ";
            }
            
        }
        
        System.out.println(leaders);
		
	}

}
