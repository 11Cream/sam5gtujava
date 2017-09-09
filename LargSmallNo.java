import java.util.*;
class largSmallNo
{
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("How many Number You want to Enter????");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Numbers:");
		for(int i=0;i<n;i++)
		{
			System.out.print("Number"+(i+1)+" = ");
			arr[i]=sc.nextInt();
		}
		int larg=arr[0];
		int small=arr[0] ;
		for(int i=1;i<arr.length;i++)
		{
			
			if(larg<arr[i])
				larg=arr[i];

			if(small>arr[i])
				small=arr[i];
		}	

		System.out.println("Largest number is ="+larg+"\tSmallest Number is " + small);
		
	}
}