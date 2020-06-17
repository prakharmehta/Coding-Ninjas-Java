package searchingAndSorting;

import java.util.Scanner;

public class SortInsertion {

	static Scanner s = new Scanner(System.in);
	
	public static void insertionSort(int arr[])
	{
		for(int i = 0; i<arr.length - 1; i++)
		{
			int j = i;
			int temp = arr[i + 1];
			while(j>=0 && arr[j]> temp)
			{
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}
	
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

		insertionSort(arr);
		printArray(arr);

	}

}
