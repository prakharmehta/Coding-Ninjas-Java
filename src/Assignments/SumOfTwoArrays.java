package Assignments;

import java.util.Scanner;

public class SumOfTwoArrays {
	
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		print(sumOfTwoArrays(arr1, arr2));
	}
	
	public static int[] sumOfTwoArrays(int[] arr1, int[] arr2){
		/* Your class should be named SumOfTwoArrays
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return the output array. No need to print.
		 * Taking input and printing output is handled automatically.
		 */
		/*int l1=arr1.length;
        int l2=arr2.length;
        int size=0;
        if(l1>=l2)
        {
            size=l1+1;
        }
        else
        {
            size=l2+1;
        }
        int sum[] = new int[size];
        
        int carry = 0;
        int i = l1 - 1;
        int j = l2 - 1;
        
        for(int k = size - 1; k>=0; k--)
        {	
            if(i>=0 && j>=0)
            {
				if((arr1[i] + arr2[j] + carry) >= 10)
                {
                    sum[k] = (arr1[i] + arr2[j] + carry)%10;
                    carry = 1;
                }
                else
                {
                    sum[k] = arr1[i] + arr2[j] + carry;
                    carry = 0;
                }
                j--;
                i--;
            }
            else if (i<0 && j>=0)
            {
                if((arr2[j] + carry) >= 10)
                {
                    sum[k] = (arr2[j] + carry)%10;
                    carry = 1;
                }
                else
                {
                    sum[k] = arr2[j] + carry;
                    carry = 0;
                }
                j--;
            }
            else if(j<0 && i>=0)
            {
                if((arr1[i] + carry) >= 10)
                {
                    sum[k] = (arr1[i] + carry)%10;
                    carry = 1;
                }
                else
                {
                    sum[k] = arr1[i] + carry;
                    carry = 0;
                }
                i--;
            }
            
        }        
        return sum;
    }
        */
        int l1=arr1.length;
        int l2=arr2.length;
        int size=0;
        if(l1>=l2)
        {
            size=l1+1;
        }
        else
        {
            size=l2+1;
        }
        
        int arr[]=new int[size];
        int a=l1-1;
        int b=l2-1;
        int carry =0;
        for(int i=size-1;i>=0;i--)
        {
            if(a>=0 && b>=0)
            {
                arr[i]=arr1[a]+arr2[b]+carry;
                carry=arr[i]/10;
                arr[i]=arr[i]%10;
                a--;
                b--;
            }
            else if(a<0 && b>=0)
            {
                arr[i]=arr2[b]+carry;
                carry=arr[i]/10;
                arr[i]=arr[i]%10;
                b--;
            }
            else if(b<0 && a>=0)
            {
                arr[i]=arr1[a]+carry;
                carry=arr[i]/10;
                arr[i]=arr[i]%10;
                a--;
            }
        }
        return arr;
	}
}
