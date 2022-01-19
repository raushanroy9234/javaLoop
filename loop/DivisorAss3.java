package loop;

public class DivisorAss3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while(i <= 40)
		{
			if(i % 3 == 0 & i % 7 == 0)
			{
				System.out.println(i +" is divisible by 3 and 7");
			}
			i++;
		}

	}

}
