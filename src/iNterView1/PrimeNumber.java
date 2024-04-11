package iNterView1;

public class PrimeNumber {
	public static void main(String[] args) {
		int count =0;
		int num=23;
		for(int i=2;i<=num;i++) {
			if(num % i == 0) {
				count++;
			}
		}
		if(count ==1) {
			System.out.println("Given number is prime");
		}
		else
		{
			System.out.println("Not prime");
		}
			}
		}
	
