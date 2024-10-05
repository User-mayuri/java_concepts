package array;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj= new MethodOverloading();
		obj.search(10);  //call by value/argument
		
	}
	
		// TODO Auto-generated method stub
   public void search(int a)
   {
	   System.out.println(a);
   }
   public void search(int price, String color)
   {
	   
   }
   public void search(int price, String color, String name)
   {
	   
   }
	}


