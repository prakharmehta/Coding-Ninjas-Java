package searchingAndSorting;

import java.util.Scanner;

public class BubbleSort {
	
	public static void bubbleSort(int[] arr){
        //Your code goes here
		for(int i = 0; i<arr.length - 1; i++)
        {
            for(int j = 0; j<arr.length - i - 1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
	
	static Scanner s = new Scanner(System.in);

	public static int[] takeInput(){
		
		int size = s.nextInt();
		int[] input = new int[size];
		
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	

	public static void printArray(int[] arr) {
		
		for(int element : arr) {
			System.out.print(element + " ");
		}
		System.out.println();

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = takeInput();

		bubbleSort(arr);
		printArray(arr);

	}

}
