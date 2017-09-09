import java.util.*;
class Complex
{
	int real;
	int img;
	Complex()
	{
		real=0;
		img=0;
	}
	Complex(int a,int b)
	{
		real=a;
		img=b;		
	}
	void Addition(Complex x,Complex y)
	{
		//Complex Add=new Complex();
		real=x.real+y.real;
		img=x.img+ y.img;
		//return Add;
	}
	Complex Subtraction(Complex x,Complex y)
	{
		Complex Sub=new Complex();
		Sub.real=x.real-y.real;
		Sub.img=x.img - y.img;
		return Sub;
	}
	void Display(Complex Z)
	{
		System.out.println("("+Z.real+","+Z.img+")");
	}
	
};
class ComplexO
{
	public static void main(String []args)
	{
		Complex C1= new Complex(5,10);
		Complex C2= new Complex(4,9);
		Complex Ans= new Complex();
		Complex Sub=new Complex();
		Ans.Display(C1);
		Ans.Display(C2);
		Ans.Addition(C1,C2);
		Ans.Display(Ans);
		Sub=Sub.Subtraction(C1,C2);
		Sub.Display(Sub);
		
	}
	
	
}