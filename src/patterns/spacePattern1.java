package patterns;

public class spacePattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int i = 1;
		        while(i<=5)
		        {	
		            int space = 5-i;
		            while(space>=1)
		            {
		                System.out.print(" ");
		                space--;
		            }
		            int j = 1;
		            while(j<=i)
		            {	
		                System.out.print(j);
		                j++;
		            }
		            System.out.println();
		            i++;
		        }
				
			}

}
