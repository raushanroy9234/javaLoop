
package loop;
import java.util.*;

public class PrimeNumber{
	
	public static int  isPrimeNumber(int num)
	{
		int i =1;
		int count1 = 0;
		while(i < num)
		{
			int n = i;
			int temp = n;
			
			int count = 0;
			int j = 2;
			while(j < n)
			{
				
				if(n % j == 0)
				{
					count++;
				}
				j++;
				
				
			}
			if(count == 0)
			{
				count1++;
			}
			
			
			i++;
		}
		return count1;
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :: ");
		int num = sc.nextInt();
		int result =isPrimeNumber(30);
		System.out.println("the count  of all the prime number :: " + result);
		
	}
}