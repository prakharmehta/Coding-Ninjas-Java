package stringsAnd2DArrays;

import java.util.Scanner;

public class ReverseStringWordWise {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(reverseWordWise(input));
	}
	
	public static String reverseWordWise(String input) {
		// Write your code here
        String[] words = input.split(" ");
		String reversedString = "";
        for(int i = words.length - 1; i>=1; i--)
        {
            reversedString += words[i] + " ";
        }
        reversedString += words[0];
        return reversedString;

	}

}
