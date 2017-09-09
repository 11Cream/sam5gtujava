import java.util.*;
class Tringle
{
	double side1;
	double side2;
	double side3;
	double area;
	Tringle(double a=1,double b=1,double c=1)
	{
		side1=a;
		side2=b;
		side3=c;
		
	}
	double getarea()
	{
		area=1/2*side1*side2;
		return area;
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
		Tringle t=new Tringle();
		t.getarea();
		t.display();
	}
}