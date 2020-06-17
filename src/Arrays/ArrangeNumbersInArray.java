package Arrays;

import java.util.Scanner;

public class ArrangeNumbersInArray {

	static Scanner S = new Scanner(System.in);

	public static void printArray(int[] arr) {
		
		for(int element : arr) {
			System.out.print(element + " ");
		}
		System.out.println();

	}
	
	public static void arrange(int[] arr, int n) {
        /*
            Your Code goes here
            You only need to fill the array in the order asked for.
            Printing of the array is taken care at our end.
        */
        if(arr.length%2 == 0)
        {
            for(int i = 0; i<arr.length/2; i++)
        {
            arr[i] = 2*i+1;
        }
        for(int i = arr.length/2,j = 0; i<arr.length; i++)
        {	
            arr[i] = arr.length - 2*j;
            j+=1;
        }
        }
        else
        {
            for(int i = 0; i<=arr.length/2; i++)
    		{
            	arr[i] = 2*i+1;
        	}
            for(int i = arr.length/2 + 1,j = 1; i<arr.length; i++)
            {
                arr[i] = arr.length - j;
                j+=2;
            }
        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = S.nextInt();
		int[] arr = new int[n];

		arrange(arr, n);
		printArray(arr);

	}

}
