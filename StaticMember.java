class StaticMember
{	
	static int x = 10;

	static int func()
		{
			int y = x;
			return y;
		}
		
	public static void main(String[] args)
	{
		System.out.println(func());
	}
}