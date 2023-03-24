// static variable value is shared among the multiple objects of the same class.

class Test2
{
	static int x;
	
	static
	{
		x=90;
	}
	
	void expression()
		{
			x++;
		}
		
	void display()
	{
		System.out.println("X: "+x);		
	}
	
	public static void main(String[] args)
		{
			Test2 obj1 = new Test2();
			obj1.expression();
			obj1.display();
			
						
			Test2 obj2 = new Test2();
			obj2.expression();
			obj2.display();
				
			Test2 obj3 = new Test2();
			obj3.expression();
			obj3.display();
			
				
			Test2 obj4 = new Test2();
			obj4.expression();
			obj4.display();
					
		}	
}