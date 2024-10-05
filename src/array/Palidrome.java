package array;

import java.util.Scanner;

public class Palidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	      String original, reverse = ""; // Objects of String class  
//	      Scanner in = new Scanner(System.in);   
//	      System.out.println("Enter a string/number to check if it is a palindrome");  
//	      original = in.nextLine();   
//	      int length = original.length();   
//	      for ( int i = length - 1; i >= 0; i-- )  
//	         reverse = reverse + original.charAt(i);  
//	      if (original.equals(reverse))  
//	         System.out.println("Entered string/number is a palindrome.");  
//	      else  
//	         System.out.println("Entered string/number isn't a palindrome.");   

		
		String original,reverse="";
		Scanner in = new Scanner(System.in);
		System.out.println("Entered no is");
		
		original=in.nextLine();
		
		for(int i=original.length()-1;i>=0;i--)
			reverse=reverse+original.charAt(i);
		if(original.equals(reverse))
			System.out.println("Palidrome");
		else
			System.out.println("non palidrome");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String original="";
//		String reverse="";
//		Scanner in=new Scanner(System.in);
//		System.out.println("Enter a no:");
//		original=in.nextLine();//to get input from user
//		int length=original.length();
//		for(int i=length-1;i>=0;i--)
//		{
//			reverse=reverse+original.charAt(i);
//		}
//		
//		if(original.equals(reverse))
//		{
//			System.out.println("Entered no is palidrome");
//		}
//		else
//		{
//			System.out.println("No Palindrome");
//		}
//		
//		
//		
	
		
		
		
		
		
	}

	
	
	
}
