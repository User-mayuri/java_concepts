package array;

public class RevString1 {

	public static void main(String[] args) {
		
		int arr[]= {1,5,3,9,6,8};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if (arr[i]>arr[j])
				{
					int c=arr[i];
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