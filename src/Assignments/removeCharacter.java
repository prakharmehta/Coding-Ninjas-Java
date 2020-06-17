package Assignments;

import java.util.Scanner;

public class removeCharacter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		char c = s.next().charAt(0);
		System.out.println(removeAllOccurrencesOfChar(input, c));
	}
	
	public static String removeAllOccurrencesOfChar(String input, char c) {
	    // Write your code here
		String x = "";
        for(int i = 0; i<input.length(); i++)
        {
            if(input.charAt(i) == c)
            {
                continue;
            }
            x+=input.charAt(i);
        }
        return x;
        
	}

}
