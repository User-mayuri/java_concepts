package array;

public class Methodoverloading1 {

	public static void main(String[] args) {
		Methodoverloading1.main(10);
		Methodoverloading1.main("kiacar",2024);
		Methodoverloading1.main(2024,"Kiacar");
}
	
   public static void main(int i)
   {
	   System.out.println(i);
	   //return i;
   }
   public static void main(String s,int i)
   {
	   System.out.println(s+' '+i);
   }
   public static void main(int i,String s)
   {
	   System.out.println(i+"Kiacar");
   }
}
