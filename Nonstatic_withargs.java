package method;

public class Nonstatic_withargs {

 	 void add(int a,int b)
	{
		System.out.println(a+b);
	}
	 void sub(int a,int c)
	{
		System.out.println(c-a);
	}
	 void name(String a,char b)
	{
		System.out.println("1");
		
	}
	
	public static void main(String[] args) {
		System.out.println("calling Non-static methods with variation in args");
		Nonstatic_withargs a=new Nonstatic_withargs();
		a.add(10,100);
		a.sub(56,11);
		a.name("abc",'x');	
	}

}

