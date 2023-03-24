class MyClass1
{
	static 
	{
		System.out.println("Static block");		
	}
	
	{
	 // instance block
	 
	 System.out.println("instance block");	
	}
	
	public static void main(String[] args)
		{
			MyClass1 obj1= new MyClass1();			
			MyClass1 obj2= new MyClass1();
			MyClass1 obj3= new MyClass1();		
		}
}