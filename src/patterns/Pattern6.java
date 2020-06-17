package patterns;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int t = 1;
		while(i<=4)
		{	
			int j = 1;
			while(j<=i)
			{
				System.out.print(t);
				t++;
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
