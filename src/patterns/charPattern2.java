package patterns;

public class charPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while(i<=4)
		{
			int j = 1;
			while(j<=4)
			{
				System.out.print((char)('A'+ i + j - 2));
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
