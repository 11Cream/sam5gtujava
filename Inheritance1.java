interface A{
	String a ="This is a interface";
}
interface B{
	String b ="This is b interface";

}
class C implements A,B
{
	String c ="This is C class";
}
class Da extends C{
	String d ="This is D class";
	Da()
	{
		System.out.println(d+"\n"+c+"\n"+b+"\n"+a+"\n");
	} 
}
class Inheritance1
{
	public static void main(String[] args) {
		Da o =new Da();

	}
}