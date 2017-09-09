interface A
{
	String a ="This is a interface";
}
interface B extends A
{
	String b ="This is b interface";

}
interface C extends A
{
	String c ="This is C interface";
}
class Da implements B,C{
	String d ="This is D class";
	Da()
	{
		System.out.println(d+"\n"+c+"\n"+b+"\n"+a+"\n");
	} 
}
class Inheritance2
{
	public static void main(String[] args) {
		Da o =new Da();

	}
}