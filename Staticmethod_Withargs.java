package method;

public class Staticmethod_Withargs {
 	static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	static void sub(int a,int c)
	{
		System.out.println(c-a);
	}
	static void name(String a,char b)
	{
		System.out.println("name");
		
	}
	
	public static void main(String[] args) {
		System.out.println("calling static methods with variation in args");
		add(10,100);
		sub(56,11);
		name("abc",'x');	
	}

}

