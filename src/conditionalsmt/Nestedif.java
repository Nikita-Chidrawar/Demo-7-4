package conditionalsmt;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int apple =100;
		if(apple<90)
		{
			System.out.println("purchase the apple");
			
		}
		
		if (apple<50) {
			
			System.out.println("purchase the apple 1");

			
		}
		
		else if (apple<90)
		{
			System.out.println("purchase the apple 2");
	
		}
		
		else 
		{
			System.out.println("dont purchase the apple ");

		}
		

	}

}
