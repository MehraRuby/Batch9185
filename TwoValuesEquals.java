

import java.util.Scanner;

class TwoValuesEquals
{
	public static void main(String[] arg)
		{
			int a;
			int b;
			int c;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter 3 values: ");
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			if( a==b && b==c)
				System.out.println("Equals");
			else if( a==b && b!=c)
				System.out.println("A and B are equals only");
			else if( b==c && a!=c)
				System.out.println("B and C are equals only");	
			else if( a==c && b!=c)
				System.out.println("A and C are equals only");
			else
				System.out.println("All values are different");
			
											
		}
}


 