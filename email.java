import java.util.*;
class Email
{
		public static void main(String args[])
		{
			int flage=0,i,j=0,count=0;
			char en[]=new char[20];
			// en1[]=new char[20]

			//String sc;
			char s;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the id....");
			en=sc.next().toCharArray();
			//en1=sc.next().toCharArray();
			for(i=0;i<en.length;i++)
			{
				if(en[i]=='@')
				{
					j=i;
					flage=1;
					count++;
				}
			//System.out.println(j);
			}
			if(count==1&&flage==1)
			{
				System.out.println("valid");
				for(i=0;i<j;i++)
				{
					System.out.print(en[i]);
					
				//	System.out.print(en[i]);
				//en[i] = en[i].substring(j,count+1);		
//System.out.print(en);			
				}
					i++;
					System.out.println();
					
				for(;i<en.length;i++)
				{
					System.out.print(en[i]);
					
				//	System.out.print(en[i]);
				//en[i] = en[i].substring(j,count+1);		
//System.out.print(en);			
				}
				//en[i]=en[i].substring(j+1,en.length);
				
				
			//System.out.print("User id is-->"+en.substring(j+1));
			}
			else
			{
				System.out.println("invalid");
			}
			
		}
}