package Assignments;

import java.util.Scanner;

public class sortZeroOne {
	
	public static void sortZeroesAndOne(int[] arr) {
        //Your code goes here
		for(int i = 0, j = arr.length - 1; i<j;i++)
        {    
            	if(arr[i] == 1)
                {
                    while(arr[j] != 0 && j>i)
                    {
                        j--;
                    }
                    if(arr[j]==0)
                    {
                        int temp = arr[i] ;
                        arr[i] = arr[j];
                        arr[j] = temp;
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

	public static void printArray(int[] arr) {	
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}

	
	public static void main(String[] args) {
		int[] arr = takeInput();
		sortZeroesAndOne(arr);
		printArray(arr);
	}

}
