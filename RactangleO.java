class Ractangle{
	double x,y,height,wigth;
	Ractangle()
	{
		x=0;
		y=0;
		height=1;
		wigth=1;

	}
	Ractangle(double a,double b,double h,double w)
	{
		x=a;
		y=b;
		height=h;
		wigth=w;
	}
	void getArea()
	{
		System.out.println("Area of Ractangle is "+(height*wigth));
	}
	void getPerimeter() 
	{
		System.out.println("x\t= "+x);
		System.out.println("y\t= "+y);
		System.out.println("height\t= "+height);
		System.out.println("wigth\t= "+wigth);
	}
}
class RactangleO
{
	public static void main(String[] args) {
		Ractangle R1 = new Ractangle();
		Ractangle R2 = new Ractangle(4,5,6,7);
		R1.getArea();
		R1.getPerimeter();
		R2.getArea();
		R2.getPerimeter();
	}
}