package conditionalsmt;

public class Nestediff 
// program for Nested IF
{
	
	public static void main (String [] args)
	{
	
	int x=10000;
	
	if (x>5000)// outer if block
	{
		
		// inner if else block
		if (x<1000 &  x< 12000)
		{
			System.out.println("purchase a");
			
		}
		
		
		else if (x>5000 & x> 7000)
		{
			 System.out.println("purchse b");
		}
		
		
		
	}
	
	else
	{
		System.out.println("dont purchase");
	}
	
	
	
	
	
	
	
	}
}
	
