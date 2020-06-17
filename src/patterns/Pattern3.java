package patterns;

public class Pattern3 {
	public static void main(String args[])
	{
		int i = 1;
		while(i<=4)
		{
			int j = 1;
			while(j<=4)
			{
				System.out.print(i);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
