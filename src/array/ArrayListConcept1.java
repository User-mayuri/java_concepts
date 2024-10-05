package array;

import java.util.ArrayList;

public class ArrayListConcept1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		
		System.out.println(arr);
		
		arr.remove(1);
		System.out.println(arr);

		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}

	}

}
