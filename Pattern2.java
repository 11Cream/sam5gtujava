import java.util.*;
class Pattern2
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc= new Scanner(System.in);
				System.out.println("Enter n");
				n=sc.nextInt();
		for(int i=0;i<n;i++)
			{
				
				for(int j=i;j<i;j++)
					System.out.print(" ");
				for(int j=i;j<n;j++)
					System.out.print("* ");
				
				System.out.println();
			}

	}
}