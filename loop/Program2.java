package loop;

public class Program2 {
	
	static int findTotal(int sub1,int sub2, int sub3)
	{
		int totalmarks = sub1+sub2+sub3;
		System.out.println( "total marks :: "+  totalmarks);
		
		return totalmarks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalmarks = findTotal(100,56,89);
		float avg = totalmarks/3;
		System.out.println("average marks :::  " + avg);

	}

}
