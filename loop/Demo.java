package loop;
import java.util.*;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 145;
		int sum = 0;
		while(n > 0)
		{
			int fact = 1;
			
			int rem = n % 10;
			while(rem > 0)
			{
				fact = fact * rem;
				rem--;
				
			}
			sum = sum + fact;
			
			

			n = n / 10;
		}
		System.out.println("the sum of factorial of number ::" + sum);
	}
}
