package Assignments;

import java.util.Scanner;

public class arrayUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Size of array = 2N + 1; N are duplicate numbers, one number is unique
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
	}
	
	
	public static int findUnique(int[] arr){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        int x = 0;
		for(int i = 0; i<arr.length; i++)
        {	
            int count = 1;
            for(int j = 0;j<arr.length ;j++)
            {
                if(j == i)
                {
                    continue;
                }
                if(arr[i] == arr[j])
                {
                    count++;
                }                
            }
            if(count == 1)
                {
                   x = arr[i];
                   break;
                }
        }
        return x;
	}

}
