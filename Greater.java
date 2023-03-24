//Q1: Enter 3 numbers and find out which one is greater */

import java.util.Scanner;

class Greater
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
			
			if(a==b && b==c)
				System.out.println("All values are equals");
			else if( (a > b) && (a > c) )
				System.out.println("A is greater");
			else if ( (b > c) && (b > a) )
				System.out.println("B is greater");
			else
				System.out.println("C is greater");
											
		}
}
//Q: Find whether the 3 values are equals or not

 