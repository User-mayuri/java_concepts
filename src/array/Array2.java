package array;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
		String name[]=new String[4];
		name[0]="Kia";
		name[1]="car";
		name[2]="in";
		name[3]="2024";
		
		System.out.println(Arrays.toString(name));
		
		
        
	}

}
