package Assignments;

import java.util.Scanner;

public class reverseEachWord {
	
	public static String reverseEachWord(String input) {
		// Write your code here
		String words[] = input.split(" ");
        String output= "";
        for(int i = 0; i<words.length; i++)
        {	
            String wordRev = "";
            for(int j = words[i].length() - 1; j>=0; j--)
            {
                wordRev+=String.valueOf(words[i].charAt(j));
            }
            output += wordRev + " ";
        }
        return output;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(reverseEachWord(input));
	}
	
	

}
