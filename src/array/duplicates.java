package array;

import java.util.LinkedHashSet;

public class duplicates {
//	public static void removeDuplicates(int a[])
//	{
//		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
//		for(int i=0;i<a.length;i++)
//		set.add(a[i]);
//		System.out.println(set);
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//   int a[]= {1,2,3,3,4,6,7,8};
//   
//   removeDuplicates(a);
//	}

	public static void main(String args[])
	{
		int a[]= {1,2,2,3,4,5,5,6,7};
		removeduplicates(a);
	}
	public static void removeduplicates(int a[]){
		LinkedHashSet<Integer>set=new LinkedHashSet<Integer>();
	   for(int i=0;i<a.length;i++)
	   set.add(a[i]);
	   System.out.println(set);
			
				
	}
}
