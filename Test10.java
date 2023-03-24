class Test10
{
public static void main(String[] args)
	{
		int x=20;
		String str = (x<15)?"small":(x<22)?"tiny":"huge";
		System.out.println(str);
	
		int a=0,b=0,c=0;
			
			a = (++a + b--) *c++;
			System.out.println(a);	
			
			
		int p=5 ,q=2 ,exp=10;
		exp = exp % p + (p > 6? ++q :--q);
		System.out.println(exp);
		
			
	}

}