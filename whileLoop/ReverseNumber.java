package whileLoop;

public class ReverseNumber {
	
	public static void isReverseNumber(int num)
	{
		int rev_no = 0;
		do
		{
			int rem = num % 10;
			rev_no = rev_no * 10 + rem;
			num = num / 10;
		}while(num > 0);
		System.out.println("the reverse number is :: " + rev_no);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isReverseNumber(123);

	}

}
