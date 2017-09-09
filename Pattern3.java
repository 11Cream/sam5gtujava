import java.util.*;
class Pattern3
{
	public static void main(String[] args)
	{
		int n,k=0;
		Scanner sc= new Scanner(System.in);
				System.out.println("Enter n");
				n=sc.nextInt();
		for(int i=0;i<n;i++)
			{
				

				for(int j=k;j<n;j++)
					System.out.print(" ");
				for(int j=0;j<k;j++)
					System.out.print("* ");
				
				if(i>=n/2)
					k--;
				else
					k++;
				System.out.println();
			}

	}
}