package Assignments;

import java.util.Scanner;

public class ArrayRotation {

	static Scanner s = new Scanner(System.in);

	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		int index = s.nextInt();

		rotate(arr, index);
		printArray(arr);
	}
	
	public static void rotate(int[] arr, int d) {
        //Your code goes here
        int j = 0;
        int count = 0;
        while(count<d)
        {	
            int i = 0;
            int temp = arr[j];
            while(i< arr.length - 1)
            {	
                arr[i] = arr[i+1];
                i++;
            }
            arr[i] = temp;
            count++;
        }
    }
}
