import java.util.*;
class Student
{
	int regno;
	String NAME;
	int mark[]=new int[6];
	int totle;
	int per;
	void getMark()
	{
		System.out.println("Enter student Regno And Name");

		Scanner sc= new Scanner(System.in);
		regno=sc.nextInt();
		NAME=sc.nextLine();
		System.out.println("Enter the 5 Subject Mark");
		mark[0]=sc.nextInt();
		mark[1]=sc.nextInt();
		mark[2]=sc.nextInt();
		mark[3]=sc.nextInt();
		mark[4]=sc.nextInt();
		mark[5]=sc.nextInt();
	}
	void display()
	{
		System.out.println("Regno = \t"+regno+"\nName  =\t"+NAME);
		for(int i=0;i<5;i++)
			System.out.println("Subject[i] \t"+mark[i]);
		    System.out.println("----------------------");
		System.out.println("Totle  \t\t"+totle);
		System.out.println("Percentage  \t"+per+"%");

	}

	void result()
	{
		totle=mark[0]+mark[1]+mark[2]+mark[3]+mark[4]+mark[5];
		per=totle/5;

	}
	

};
class result
{
	public static void main(String[] args)
	{
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		Student s5=new Student();
		s1.getMark();
		s1.result();
		
		s2.getMark();
		s2.result();
		s3.getMark();
		s3.result();
		s4.getMark();
		s4.result();
		s5.getMark();
		s5.result();
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		s5.display();
	}
}