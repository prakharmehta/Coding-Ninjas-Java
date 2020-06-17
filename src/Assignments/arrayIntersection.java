package Assignments;

import java.util.Scanner;

public class arrayIntersection {
	
	static Scanner S = new Scanner(System.in);
	
	public static void intersections(int[] input1, int[] input2){
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
        for(int i = 0; i<input1.length; i++)
        {	
            for(int j = 0; j<input2.length; j++)
            {
                if(input1[i] == input2[j])
                {
                    System.out.println(input1[i]);
                    input2[j]=Integer.MIN_VALUE;
                	break;
            	}
            }
                    
        }
	}
	
	public static int[] takeInput() {	
		int size = S.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = S.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();

		intersections(arr1, arr2);
	}

}
