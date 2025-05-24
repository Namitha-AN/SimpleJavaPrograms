package method;

	class Parent
	{
		void add()
				{
					System.out.println("addition");
				}
	         }
	
	public class Super extends Parent{
		 void add()
		{
			System.out.println("do addition with 2 numbers");
			super.add();
		}
		 public static void main(String[] args) {
		 System.out.println("Super");
		 Super a=new Super();
		 a.add();
		}

	}


