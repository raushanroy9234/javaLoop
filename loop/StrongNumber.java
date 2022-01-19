package loop;
import java.util.*;
//strong number :: sum of factorial of each digit a number is equal to original number  1!+4!+5!=1

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i = 1;
		//while(i <= 1000)
		//{
		//	int n = i;
			//in
		//}
		int i = 1;
		while(i <= 1000)
		{
		
			int n = i;
			int temp = n;
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
			if(sum == temp)
			{
				System.out.println(sum + " is strong number...");
			}
			i++;
		}
		
		
	}
}
