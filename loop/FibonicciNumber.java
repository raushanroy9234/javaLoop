package loop;

public class FibonicciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//fibonicci number = 0,1,1,2,3,5,8,13,21,34
		
		//fibonicci series number by using do while loop
		int a = 0;
		int b = 1;
		int sum = 0;
		System.out.println(a);
		System.out.println(b);
		
		
		int i = 3;
		do {
			
			
			sum = a + b;
			System.out.println(sum);
			a = b;
			b = sum;
			i++;
			
		}while(i  <= 10);
		
	}

}
