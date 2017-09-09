class Strpalindrome
{
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("aaa");
		StringBuffer str1 = new StringBuffer(str);
		str1.reverse();
		System.out.println(str.charAt(0));
		System.out.println(str.compareTo(str1));

		//if(//str.compareTo(str1))
		//	System.out.println("yes");
		//else
		//	System.out.println("no");
	}
}