class Test11
{
public static void main(String[] args)
	{
		int x = 10 *(2 + ( 1 + 2 / 5));
		int y = x * 2;
		
		System.out.println( x+y < 10 ? "Hello" : "Java");
		
		int a=20,b=10;
		
		boolean c=true;
		boolean d= false;
		
		a = c ? b++ ; b--;
		
		c = !d;
		
		System.out.println( (a+b) +"  "+(c ? 5 : 10));
					
	}
}