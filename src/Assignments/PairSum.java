package Assignments;

import java.util.Scanner;

public class PairSum {
	
	public static void pairSum(int arr[], int x) {
        /* Your class should be named Solution 
         * Don't write main(). 
         * Don't read input, it is passed as function argument. 
         * Print output and don't return it. 
         * Taking input is handled automatically. 
         */
        for(int i = 0; i<arr.length; i++)
        {
            for(int j = i; j<arr.length; j++)
            {	
                if(i == j)
                {
                    continue;
                }
                if(arr[i] + arr[j] == x)
                {	
                    if(arr[i] <= arr[j])
                    {
                        System.out.println(arr[i] + " "  + arr[j]);
                    }
                    else
                    {
                        System.out.println(arr[j] + " "  + arr[i]);
                    }
                    
                }
            }
        }

    }
	
	static Scanner S = new Scanner(System.in);

	public static int[] takeInput() {	
		int size = S.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = S.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		int x = S.nextInt();

	pairSum(arr, x);
	}

}
