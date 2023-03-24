//Blocks
/* variables in a block is local*/

class Block
	{
		int s=9;
		
		{
			int a = 90;			
			System.out.println("first block A : "+a);
		}
		
		{
			//System.out.println("Access A :"+a);
			System.out.println("Access S  :"+this.s);
		}
		
		
	
		public static void main(String[] args)
			{
			
			}	
	}
	
	
