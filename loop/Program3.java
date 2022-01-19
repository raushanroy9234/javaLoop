package loop;

import java.util.Scanner;

public class Program3 {
	
	static int factorial(int n)
	{
		int fact = 1;
		while(n != 0)
		{
			fact *= n;
			--n;
		}
		return fact;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :: ");
		int n = sc.nextInt();
		int result = factorial(n);
		System.out.println("factorial of a number is :: " + result);
		if(result % 2 == 0)
		{
			System.out.println("even factorial");
		}
		else
		{
			System.out.println("odd factorial");
		}
		sc.close();

	}

}
