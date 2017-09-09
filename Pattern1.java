import java.util.*;
class Pattern1
{
	public static void main(String[] args)
	{
		char s[]={'s','t','r','a','m','e'};
		for(int i=0;i<s.length;i++)
			{
				for(int j=i;j<s.length;j++)
					System.out.print(" ");	
				for(int j=0;j<=i;j++)
					System.out.print(s[j]+" ");
				System.out.println();
			}

	}
}