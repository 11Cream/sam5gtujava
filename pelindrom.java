import java.util.*;
class pelin1
{
	public static void main(String[] args)
	{
	int i,j,flag,n,l;
	Scanner s=new Scanner(System.in);
	System.out.print("Enter digit numbe\n");
	n=s.nextInt();
	
	l=1;
	int digit[]=new int[l];
	i=0;
	do
	{
		digit = Arrays.copyOf(digit, digit.length+1);
		digit[i]=n%10;
		n=n/10;
		i++;
		l++;
		
	}while(n!=0);
	
	
	
	flag=0;
	for(i=0;i<(l-1);i++)
	{
			if(digit[i]==digit[l-2-i])
				flag++;
	
	
	//System.out.println("i"+digit[i]+"j"+digit[l-2-i] );
	}
	if(flag==(l-1))
		System.out.println("IS pelindrom");
	}
	

}