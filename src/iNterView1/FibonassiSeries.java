package iNterView1;

import java.util.Scanner;

public class FibonassiSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, a=0,b=0,c=1;
		Scanner in =new Scanner(System.in);
		System.out.println("Enter");
		num=in.nextInt();
		System.out.println("Fibonacci Series is ");
		for(int i=0;i<num;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+"");
		}

	}

}
