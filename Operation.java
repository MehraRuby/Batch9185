/* take two numbers
if one of number is greater than 20, then show its addition, substraction,
multiplication,division with another  number*/

import java.util.Scanner;

class Operation
{

	public static void main(String[] args)
		{
			int a;
			a=0;
			int b;
			b=0;
			
						
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter two numbers");
			
			a = sc.nextInt();
				
			b = sc.nextInt();				
			
			if(a>20 || b>20)
			{
				System.out.println("Add: "+(a+b));
				System.out.println("Sub: "+(a-b));
				System.out.println("Multiple: "+(a*b));
				System.out.println("Div: "+(a/b));
			
			}	

			System.out.println("Operation Done ! ");
		}
}


