import java.util.*;
class Converts
{
	double Celsius;
	double Fahrenheit;
	void a_converts(double C)
	{
			Fahrenheit=(9/5)*C+32;
			System.out.println("Fahrenheit"+Fahrenheit);
	}
	void b_converts(double F)
	{
			Celsius=(F-32)*(5/9);	
			System.out.println("Celsius"+Celsius);
	
	}
	
};
class CtoFandFtoC
{
	public static void main(String args[])
	{
		Converts C1=new Converts();
		char s;
		System.out.println("a:Celsius to Fahrenheit \n b:Fahrenheit to Celsius");
		Scanner sc= new Scanner(System.in);
		s=sc.nextCharAt();
		switch(s)
		{
			case 'a':
				C1.a_converts(23);
				break;
			case 'b':
				C1.b_converts(58);
				break;
			default:
				System.out.println("Error");
		}
	}	
}