package array;

public class Methodoverloading2 {

	public static void main(String[] args) {
	    Methodoverloading2.main(22222222);
	    Methodoverloading2.main("Hello");

	}
   public static void main(double d)
   {
	   System.out.println(d);
   }
   
   public static void main(String s)
   {
	   System.out.println("Hi");
	   return;
   }
}
