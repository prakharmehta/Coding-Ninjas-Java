package stringsAnd2DArrays;

import java.util.Scanner;

public class LargestRowOrColumn {

static Scanner s = new Scanner(System.in);
	
	
	public static int[][] takeInput2D(){
		
		int numRows = s.nextInt();
		int numCols = s.nextInt();
		int[][] input = new int[numRows][numCols];
		for(int i = 0; i < numRows; i++){
			for(int j = 0; j < numCols; j++){
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}
	
	
	public static void main(String[] args) {
	
		int input[][] = takeInput2D();
		findLargest(input);
		
	}
	
public static void findLargest(int input[][]){
		
		/* Your class should be named Solution.
		* Don't write main() function.
	 	* Don't read input, it is passed as function argument.
	 	* Print output as specified in the question
		*/
        int rlen = input.length;
        int clen = input[0].length;
        int r = 0,c = 0;
        int sum = 0;
        int index = 0;
        
        for(int i = 0; i<rlen; i++)
        {	
            int rsum = 0;
            for(int j = 0; j<clen; j++)
            {
                rsum+=input[i][j];
            }
            if(rsum>sum)
            {
                sum = rsum;
                r = 1;
                c = 0;
                index = i;
            }
        }
        
        for(int i = 0; i<clen; i++)
        {	
            int csum = 0;
            for(int j = 0; j<rlen; j++)
            {
                csum+=input[j][i];
            }
            if(csum>sum)
            {
                sum = csum;
                c = 1;
                r = 0;
                index = i;
            }
        }
        
        if(c == 1)
            System.out.println("column"+" "+(index)+" "+sum);
        else if(r == 1)
            System.out.println("row"+" "+(index)+" "+sum);
           
	}

}
