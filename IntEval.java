class IntEval
{
	public static void main(String[] args)
		{
			int a,b,c;
			b=1;
			c=2;
			a=3;
			
			int d = a+ b++ + ++c;
			
			System.out.println("D: "+d);
								
			d+= ++a * b++;
			
			System.out.println("A:"+a);
			System.out.println("B:"+b);			
			System.out.println("D: "+d);
										
		}			
}