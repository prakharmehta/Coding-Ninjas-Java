package stringsAnd2DArrays;

import java.util.Scanner;

public class SpiralPrint {

	public static void spiralPrint(int matrix[][]){
		// Write your code here
        int rs = 0, cs = 0, ce = matrix[0].length - 1, re = matrix.length - 1;
        while(cs<=ce && rs<=re)
        {	
            
         	for(int i = rs, j = cs; j<=ce; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            rs++;
            for(int i = rs, j = ce; i<=re; i++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            ce--;
            for(int j = ce, i = re; j>=cs; j--)
            {
                System.out.print(matrix[i][j] + " ");
            }
            re--;
            for(int i = re, j = cs; i>=rs; i--)
            {
                System.out.print(matrix[i][j] + " ");
            }
            cs++;
        }
	}
	
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
		int a[][] = takeInput2D();
		spiralPrint(a);
	}

}
