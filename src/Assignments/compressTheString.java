package Assignments;

import java.util.Scanner;

public class compressTheString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(compress(input));
	}
	
	public static String compress(String inputString) {
		// Write your code here
		char added = inputString.charAt(0);
        String x = "" + inputString.charAt(0);
        int count = 1;
        for(int i = 1; i<inputString.length(); i++)
        {	
            if(inputString.charAt(i) != added)
            {	
                if(count>=2)
                {
                    x+=String.valueOf(count);
                }
                x+=inputString.charAt(i);
                added = inputString.charAt(i);
                count = 1;
            }
            else
            {	
                count++;
                if(i == inputString.length() - 1)
                {
                    x+=String.valueOf(count);
                }
            }
            
        }
        return x;
	}
}
