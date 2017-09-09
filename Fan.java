import java.util.*;
class Fan
{
	int SLOW=1;
	int MEDIUM=2;
	int FAST=3;
	int speed=SLOW;
	boolean f_on=false;
	double redius=4;
	String color="blue";
	Fan()
	{

	}
	Fan(int speed,boolean f_on,double redius,String color)
	{
	this.speed=speed;
	this.f_on=f_on;
	this.redius=redius;
	this.color=color;
	}
	void display()
	{
		if(f_on==false)
		{
			System.out.println("Color\t"+color);
			System.out.println("Redius\t"+redius);
			System.out.println("Fan is off");
		}
		else
		{
			System.out.println("Speed\t"+speed);
			System.out.println("Color\t"+color);
			System.out.println("Redius\t"+redius);
			System.out.println("Fan is on");
		}	
			
	}
}
class Fanmain
{
	public static void main(String[] args) {
	Fan F1=new Fan();
	Fan F2=new Fan(2,true,6,"brown");
	F1.display();
	F2.display();

	}
}