package array;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int []arr= {1,5,3,9,8,7};
 
 System.out.println("unsorted array");
 for(int i=0;i<arr.length;i++)
 {
	   System.out.print(arr[i]);
 }
 
 for(int i=0;i<arr.length;i++)
 {  
	 for(int j=i+1;j<arr.length;j++)
	 {
		 if (arr[i]>arr[j])
		 {
			 //(arr[i],arr[j]);
			 int c=arr[i];
				arr[i]=arr[j];
				arr[j]=c;
		 }
	 }
	
 }
 System.out.println("\nsorted array");
   for(int i=0;i<arr.length;i++)
   {
	   System.out.print(arr[i]);
   }
 }


}
