import java.util.*;
class Tringle
{
	double side1;
	double side2;
	double side3;
	double area;
	Tringle()
	{
		side1=1;
		side2=1;
		side3=1;
		

		
	}
	Tringle(double a,double b,double c)
	{
		side1=a;
		side2=b;
		side3=c;
		
		
	}
	void getarea()
	{
		area=(0.5*side1*side2);
		//System.out.println("Area="+area);
	}
	
	void display()
	{
		System.out.println("Side1="+side1);
		System.out.println("Side2="+side2);
		System.out.println("Side3="+side3);
		System.out.println("Area="+area);
	}
	
	
};
class AreaofTringle
{
	public static void main(String args[])
	{
		Tringle t=new Tringle(5,8,9);
		t.getarea();
		t.display();
	}
}