package Assignments;

import java.util.Scanner;

public class CheckArrayRotation {

	static Scanner s = new Scanner(System.in);

	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = takeInput();

		System.out.println(arrayRotateCheck(arr));
	}
	
	public static int arrayRotateCheck(int[] arr){
        //Your code goes here
        int min = Integer.MAX_VALUE;
        int index = 0;
        for(int i = 0; i<arr.length; i++)
        {	
            if(arr[i]<min)
            {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
}
