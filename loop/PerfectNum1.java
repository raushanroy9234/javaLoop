package loop;

public class PerfectNum1 {

	public static void main(String[] args) {
		
		
			isPerfectNumber(1000);
		
		
		
		
		

	}
	
	public static void isPerfectNumber(int num)
	{
		int i = 1;
		while(i <= num)
		{
			
			int sum = 0;
			int j = 1;
			while( j <= i/2)
			{
				if(i % j == 0)
				{
					sum = sum + j;
				}
				j++;
			}
			
			if(sum == i)
			{
				System.out.println(sum + " is perfect number");
			}
			i++;
			
		  }
	  }

} 
