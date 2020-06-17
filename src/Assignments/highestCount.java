package Assignments;

import java.util.Scanner;

public class highestCount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(highestOccuringCharacter(input));
	}
	
	public static char highestOccuringCharacter(String inputString) {
		// Write your code here
		int countInit = 0;
        char high = '0';
        for(int i= 0; i<inputString.length(); i++)
        {
            int count = 0;
            for(int j = i; j<inputString.length(); j++)
            {
                if(inputString.charAt(i) == inputString.charAt(j))
                {
                    count++;
                }
            }
            if(count>countInit)
            {
                countInit = count;
                high = inputString.charAt(i);
            }
        }
        return high;
	}

}
