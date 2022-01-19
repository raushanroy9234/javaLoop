package loop;

import java.util.Scanner;

public class PerfectNumber {
	//perfect number = sum of divisor of a number which is equal to original number is also called as
	//perfect number
	//6 = 1, 2,3 = 1+2+3 = 6
	//28 = 1,2,4,7,14= 1+2+4+7+14=28

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number  ::: ");
		int num = sc.nextInt();
		isPerfectNumber(num);
		

	}
	
	public static void isPerfectNumber(int num)
	{
		
		int sum = 0;
		int i = 1;
		while( i <= num/2)
		{
			if(num % i ==0)
			{
				sum += i;
			}
			i++;
		}
		
		//check perfect number or not
		if(sum == num) {
			System.out.println( num +" is perfect number");
		}
		else
		{
			System.out.println(num + "is not a perfect number");
		}
		
	}
	

}
