package method;

public class MethodOverloading {
	static void add(int a,int b)
		{
			System.out.println(a+b);
		}
		static void name()
		{
			System.out.println("1");
		}
		static void name(String a,char b)
		{
			System.out.println("name");
			
		}
		 void name(char y)
			{
				System.out.println("1");
			}
			 void name(String c)
			{
				System.out.println("2");
				
			}
		
		public static void main(String[] args) {
			System.out.println("calling static methods with variation in args");
			add(10,100);
			name();
			name("abc",'x');
			System.out.println("calling Non-static methods with variation in args");
			MethodOverloading a=new MethodOverloading();
			a.name('s');
			a.name("sudha");
		}

	}



