package array;

public class arraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,5,8,3,9,6};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
			if(arr[i]>arr[j])
			{
			
				int c= arr[i];
				arr[i]=arr[j];
				arr[j]=c;
		}
		}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
