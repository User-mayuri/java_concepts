package array;

public class Mainmethodoverloading {

	public static void main(String[] args) {
	
		System.out.println("Hi");
		
		Mainmethodoverloading.main(10);
		Mainmethodoverloading.main(10, "selenium");
		Mainmethodoverloading.main("cypress","selenium");
	
		

	}
	
	public static void main(int i)
	{
		System.out.println("Hello"+i);
		
	}
	
	public static void main(int i,String s)
	{
		System.out.println("naveen"+" "+ i+ s);
	}

	public static void main(String i,String s)
	{
		System.out.println("naveen"+i+s);
	}
}
