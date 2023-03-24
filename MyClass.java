class MyClass
{
	int x=10;
	
	static int func()
		{
			MyClass obj = new MyClass();
			
				int z = obj.x;
				return z;					
		}
		
	public static void main(String[] args)
		{
			System.out.println(func());
		
		}
}