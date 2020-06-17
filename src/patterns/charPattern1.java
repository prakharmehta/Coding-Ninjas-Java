package patterns;

public class charPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while(i<=4)
		{	
			int letter = 'A';
			int j = 1;
			while(j<=4)
			{
				System.out.print((char)letter);
				letter++;
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
