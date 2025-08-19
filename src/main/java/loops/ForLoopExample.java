package loops;

public class ForLoopExample 
{
	
	public static void main(String[] args) {
		
		/*
		 * System.out.println(1); System.out.println(2); System.out.println(3);
		 */
		//.............................10 times
		
		/*
		 * for(int i=1;i<5;i++) // i=i+1; for(intialization;
		 * condition;increment/decrement) { System.out.println(i); }
		 */
		//---------------------------------
		
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<5;j++)
			{
				System.out.println(i);
				System.out.println(j);
			}
		}
		
		
	}
}
