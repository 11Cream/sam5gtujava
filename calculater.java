import java.util.*;
class calc1
{
	public static void main(String[] args)
	{
	int n,x,ans,y;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter value of x");
	x=s.nextInt();
	System.out.println("Enter value of y");
	y=s.nextInt();
	System.out.println("Enter your choise");
	System.out.println("1.addition\n2.subtraction\n3.multipication\n4.division\5Exit");
	n=s.nextInt();
	switch(n)
	{
		case 1:
			ans=x+y;
			break;
		case 2:
			ans=x-y;
			break;
		case 3:
			ans=x*y;
			break;
		case 4:
			ans=x/y;
			break;
		case 5:
			System.exit(0);
			
		
	}
	
	
	}

}