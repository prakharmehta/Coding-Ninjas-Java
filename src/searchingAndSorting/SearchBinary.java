package searchingAndSorting;

import java.util.Scanner;

public class SearchBinary {

	static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static int binarySearch(int[] arr, int val) {
        //Your code goes here
		int start = 0, end = arr.length - 1;
        int mid = (start + end)/2;
        while(arr[mid]!=val)
        {
            
            if(val>arr[mid])
            {
                start = mid + 1;
            }
            else if(val<arr[mid])
            {
                end = mid - 1; 
            }
            mid = (start + end)/2;
            if(start>end)
            {
                return -1;
            }

        }
            return mid;
        
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = takeInput();
		int val = s.nextInt();
		System.out.println(binarySearch(arr, val));

	}
	

}




