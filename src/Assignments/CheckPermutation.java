package Assignments;

import java.util.Scanner;

public class CheckPermutation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input1 = s.next();
		String input2 = s.next();
		System.out.println(isPermutation(input1, input2));
	}
	
	public static boolean isPermutation(String input1, String input2) {
	    // Write your code here
		if(input1.length()!=input2.length())
        {
            return false;
        }
        else
        {
            // int sum1 = 0, sum2 = 0;
            // for(int i = 0; i<input1.length(); i++)
            // {
            //     sum1 += (int)(input1.charAt(i));
            // }
            // for(int i = 0; i<input2.length(); i++)
            // {
            //     sum2 += (int)(input2.charAt(i));
            // }
            // if(sum1 == sum2)
            // {
            //     return true;
            // }
            // else
            // {
            //     return false;
            // }
            int freq[] = new int[26];
            
            for(int i = 0; i<input1.length(); i++)
            {
                freq[(int)(input1.charAt(i)) - 97]+=1;
            }
            for(int i = 0; i<input2.length(); i++)
            {
                freq[(int)(input2.charAt(i)) - 97]-=1;
            }
            for(int i = 0; i<26; i++)
            {
                if(freq[i]!=0)
                {
                    return false;
                }
            }
            return true;
        }
	}

}
