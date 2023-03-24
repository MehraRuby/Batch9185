class Test5
{
	static int a;
	static int b;
	static int c;
		
	Test5()
		{
		a=90;
		}
		
	static
	{
		c=78;
	}
		
	static void func()
	{
		b=45;
	}
	
	
	public static void main(String[] args)			
		{
			System.out.println("A: "+a);
			System.out.println("B: "+b);
			System.out.println("C: "+c);
		}
}