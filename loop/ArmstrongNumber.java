package loop;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		armstrongNumber(10000);
		
		

	}
	/*
	 * public static void armstrongNumber(int num)
	{
		int temp = num;
		int sum = 0;
		while(num > 0)
		{
			int rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;
			
		}
		if(sum == temp)
		{
			System.out.println(" is a armstongnumber ...");
		}
		
	}
	 */
	
	//count method
	public static int count(int num)
	{
		int count = 0;
		while(num > 0)
		{
			num = num / 10;
			count++;
			
		}
		return count;
	}
	
	//power method
	public static int power(int a, int b)
	{
		int power = 1;
		while(b > 0)
		{
			power = power * a;
			b--;
		}
		return power;
	}
	
	//armstrong number
	public static void armstrongNumber(int numb)
	{
		int i = 1;
		while(i <= numb)
		{
			int num = i;
			int temp = num;
			int countDigit = count(num);
			int sum = 0;
			while(num > 0)
			{
				int rem = num % 10;
				int pow = power(rem,countDigit);
				sum = sum + pow;
				num = num / 10;
				
			}
			if(sum == temp)
			{
				System.out.println(sum + " is a palindrome number ..");
			}
			i++;
		}
				
	}

}
