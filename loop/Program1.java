package loop;

public class Program1 {
	
	public static void printEachDigit(int n)
	{ 
	
		while(n != 0)
		{
			
			int rem = n % 10;
			System.out.println("the digit is :: " + rem);
			n = n / 10;
		}
		
	}

	public static void main(String[] args) {
		//ctrl+ d :: for deleting currnent line
		//ctrl+ i :: indentation
		//main :: ctrl + space
		//ctrl + m :: maximise
		//ctrl + m :: minimise
		//ctrl + ++ :: increase font size
		//ctrl + -- :: decrease font size
		printEachDigit(5432);
		
	}

}
