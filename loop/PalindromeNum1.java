package loop;

public class PalindromeNum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindromeNumber(1000);

	}
	
	public static void palindromeNumber(int num)
	{
		int i = 1;
		
		while(i <= num)
		{
			
		   {    
			   
			   int rev_no = 0;
			   int n = i;
			   int temp = n ;
				while(n > 0)
				{
					int rem = n % 10;
				    rev_no = rev_no * 10 + rem;
				    n = n / 10;
				}
		
				if(rev_no == temp) 
					System.out.println( rev_no + " is a plindrome number");
			    
		   i++;
		   }
		   
		}
			
	}

}


