package loop;

public class PalindromNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 121;
		int temp = n;//1
		int rev = 0;//1
		while(n > 0)//true
		{
			int rem = n % 10;//1
		    rev = rev * 10 + rem;//1
		    n = n / 10;//0  c0ndition also fails in second loop
		}
		if(rev == temp)//1 ==1
		{
			System.out.println(rev + " number is palindrome");
		}
		else
		{
			System.out.println(rev + " number is not palindrome");
		}

	}

}
