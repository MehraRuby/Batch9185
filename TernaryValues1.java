/* find whether two values are equals or any one is greater */

class TernaryValues1
	{
	public static void main(String[] args)	
		{
			int a=9;
			int b=9;
			String str ;
			
			str = (a == b)? "Equals" : ( (a > b) ? "A is greater " :"B is greater" );
			
			System.out.println(str);

			
		}

	}