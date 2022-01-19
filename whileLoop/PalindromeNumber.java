package whileLoop;

public class PalindromeNumber {
	
	public static void isPalindromeNumber(int n)
	{
		int num = n;
		int temp = num;
		int rev_no = 0;
		do
		{
			int rem = num % 10;
			rev_no = rev_no * 10 + rem;
			num = num / 10;
		}while(num > 0);
		
		if(temp == rev_no)
			System.out.println(temp +" is palindrome number..");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPalindromeNumber(121);

	}

}
