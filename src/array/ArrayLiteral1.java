package array;

import java.util.Arrays;

public class ArrayLiteral1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i [] = {10,20,30,40};
       
       
       i[0]=50;
       
       System.out.println(i[0]);
       System.out.println(Arrays.toString(i));
       
       
       System.out.println(i.length);
       //System.out.println(i[5]);
       
       System.out.println(i[i.length-1]);
       
       char ch[]= {'a','b','c','d'};
       String name[]= {"mayuri","pinki","suresh","pushpa"};
       
       float percentage[]= {77.25f,22.58f,58.22f};
       
       for(int k=0;k<=ch.length-1;k++)
       {
    	   System.out.println(ch[k]);
       }
       
       for (int j=0;j<=name.length-1;j++)
       {
    	   System.out.println(name[j]);
       }
       
       System.out.println(Arrays.toString(name));
}
}
