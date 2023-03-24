class Test1
{
static int x;

static int z;

static
{
	x=90;
	z=100;
}

	public static void main(String[] args)
		{
			Test1 obj1 = new Test1();
			
			
			Test1 obj2 = new Test1();
			
			
			
			obj1.x = obj1.x * obj2.x;   // static variable can be accessed by object of the  
										//class - in java5.0
			 
			
			System.out.println("x: "+obj1.x);
			
			Test1.z = Test1.z * Test1.z; // important appropriate way toaccess by Class name
			
			System.out.println("z: "+obj1.z);
			
		
		}
		
		



}