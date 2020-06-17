package patterns;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
        while(i<=4)
        {	
            int j = 1;
            while(j<=4-i+1)
            {	
                System.out.print(4-i+1);
                j++;
            }
            System.out.println();
            i++;
        }
	}

}
