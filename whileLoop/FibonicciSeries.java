package whileLoop;

public class FibonicciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		System.out.println("The first fibonicci series Number :::" + a);
		System.out.println("fibonicci series Number is :::"+ b);
		
		int i = 3;
		do
		{
			int sum = a + b;
			System.out.println("fibonicci series Number is ::: "+ sum);
			a = b;
			b = sum;
			i++;
		}while(i <= 10);

	}

}
