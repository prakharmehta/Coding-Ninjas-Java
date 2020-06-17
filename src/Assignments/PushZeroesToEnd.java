package Assignments;

import java.util.Scanner;

public class PushZeroesToEnd {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		s.close();
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

		pushZerosAtEnd(arr);
		printArray(arr);
	}
	
	public static void pushZerosAtEnd(int[] arr) {
        //Your code goes here
        int count = 0;
		for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] == 0)
            {
                count++;
            }
        }
        for(int i = 0, j = 0;i<arr.length;i++)
        {	
            if(arr[i] != 0)
        	{
				arr[j] = arr[i];
                j++;
            }
            if(j == arr.length - count)
            {
                break;
            }
        }
        for(int i = arr.length - count; i<arr.length; i++)
        {
            arr[i] = 0;
        }
        
    }
}


