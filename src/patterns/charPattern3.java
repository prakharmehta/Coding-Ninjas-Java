package patterns;

public class charPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int i = 1;
		        while(i<=5)
		        {
		            int j = 1;
		            while(j<=i)
		            {	
		                System.out.print((char)('A'+5-i+j-1));
		                j++;
		            }
		            System.out.println();
		            i++;
		        }
				
			}

}
