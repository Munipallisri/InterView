package iNterView1;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner in =new Scanner(System.in);
		System.out.println("Enter your key word");	
		str=in.nextLine();
		String[] token=str.split("");
		for( int i=token.length-1;i>=0;i--)
		{
			System.out.println(token[i] + "");
		}

	}
 
}
