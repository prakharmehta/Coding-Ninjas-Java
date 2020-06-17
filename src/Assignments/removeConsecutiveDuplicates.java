package Assignments;

import java.util.Scanner;

public class removeConsecutiveDuplicates {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(removeConsecutiveDuplicates(input));
	}
	
	public static String removeConsecutiveDuplicates(String input) {
	    // Write your code here
        String x = "";
        char added = '0';
        for(int i = 0; i<input.length(); i++)
        {
            if(input.charAt(i)!=added)
            {
                x+=(input.charAt(i));
                added=(input.charAt(i));
            }
        }
        return x;
        
	}

}
