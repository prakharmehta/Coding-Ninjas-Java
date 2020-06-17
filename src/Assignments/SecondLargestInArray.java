package Assignments;

import java.util.Scanner;

public class SecondLargestInArray {

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

		System.out.println(secondLargestElement(arr));
	}
	
	static void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 

            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    }
    
    public static int secondLargestElement(int[] arr) {
        //Your code goes here
        int n = arr[0];
        int count = 0;
        for(int i = 1; i<arr.length; i++)
        {
            if(arr[i]!= n)
            {
                count++;
            }
        }
        if(arr.length<=1 || count == 0)
        {
            return -2147483648;
        }
        else
        {
           	sort(arr);
            int x = 0;
        	for(int i = arr.length - 2; i>=0; i--)
            {
                int temp = arr[arr.length - 1];
                if(arr[i]!= temp)
                {
                    x = arr[i];
                    break;
                }
            }
            return x;
        }
    }
}
