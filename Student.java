class Student
{
		int stid;
		static int score;
		
		static 
		{
			score = 89;
		}
		
		public static void main(String[] args)
			{
				Student s1 = new Student();
				Student s2 = new Student();
	
				System.out.println(s1.score);
				System.out.println(Student.score);
	
				Student.score = Student.score *100;
				
				System.out.println(Student.score);
				
				System.out.println(s2.score);
				
				
	
			}
		
	
}