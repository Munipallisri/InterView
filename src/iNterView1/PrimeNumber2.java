package iNterView1;

public class PrimeNumber2 {
	public static void main(String[] args) {
		int count=0;
		int num=23;
					for(int i=2;i<num;i++) {
						if(num%i==0) {
							count++;
						}
					}
					if(count==0 && num>1) {
						System.out.println("p");
					}
					else {
						System.out.println("np");
					}
}	
}