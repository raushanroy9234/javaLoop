package loop;

import java.util.Scanner;

public class CubeEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the number ::: ");
		int num = sc.nextInt();
		evenOdd(num);

	}
	
	
	public static void evenOdd(int num)
	{
		int oddResult = 0;
	    int evenResult = 0;
		while(num > 0)
		{
			int rem = num % 10;
			
					
			if(rem % 2 == 0)
			{
				evenResult += rem * rem;
				
			}
			else
			{
				oddResult += rem * rem * rem;
			}
			num = num / 10;
		}
		System.out.println(" even result is :: " + evenResult);
		System.out.println(" odd result is :: " + oddResult);
		
	}

}
