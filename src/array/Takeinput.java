package array;

import java.util.Scanner;

public class Takeinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner src=new Scanner(System.in);
		System.out.println("enter no");
		int a=src.nextInt();
		System.out.println("entered no is:"+a);
		
		

		Scanner src1=new Scanner(System.in);
		System.out.println("enter no");
		int b=src1.nextInt();
		System.out.println("entered no is:"+b);
		
		int sum=a+b;
		System.out.println(sum);

	}

}
