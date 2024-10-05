package array;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Array is a non primitive data type
		//can store similar kind of data types
		
		int i[]	=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		
		System.out.println(i.length);
		System.out.println(i[0]);
		System.out.println(i[3]);
		
		System.out.println(i);//it till give you address of array;
		
		System.out.println(Arrays.toString(i));
		
		for(int k=0;k<=3;k++)
		{
			System.out.println(i[k]);
			if(i[k]==20)
			{
				System.out.println("Hi");
				break;
			}
			System.out.println("Bye");
		}
	     
		short sh[]=new short[3];
		System.out.println("length="+sh.length);
		System.out.println("Li="+0);
		System.out.println("length="+(sh.length-1));
		
		
				
	   char ch[]=new char[4];
	   ch[0]='a';
	   ch[1]='b';
	   ch[2]='c';
	   
	   System.out.println(Arrays.toString(ch));
		
	   
	   String str[]=new String[4];
	   str[0]="Mayuri";
	   str[1]="pinki";
	   str[2]="suresh";
	   str[3]="pushpa";
	   
	  System.out.println(Arrays.toString(str));
	  
	  //A
		
	  Object empData[]=new Object[5];
	  empData[0]="Ankush";
	  empData[1]="30";
	  empData[2]="56";
	  
	  System.out.println(Arrays.toString(empData));
		
	
	}

}
