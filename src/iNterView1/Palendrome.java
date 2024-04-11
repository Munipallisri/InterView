package iNterView1;

import java.util.Scanner;

public class Palendrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original,reverse ="";
		Scanner in =new Scanner(System.in);
		int length;
		original=in.nextLine();
		length=original.length();
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+original.charAt(i);
		}
		System.out.println("reverseis :" + reverse);
		if(original.equals(reverse))
		{
			System.out.println("number is palindrome");
		}
		else 
			System.out.println("not palindrome");
		}

	}


