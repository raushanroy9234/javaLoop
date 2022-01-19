package whileLoop;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void isPrimeNumber(int num)
	{
		int count = 0;
		int i = 2;
		do
		{
			if(num % i == 0)
			{
				count++;
			}
			i++;
		}while(i < num);
		if(count == 0)
			System.out.println(num +" is prime number...");
		i++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :: ");
		int num = sc.nextInt();
		isPrimeNumber(num);

	}

}
