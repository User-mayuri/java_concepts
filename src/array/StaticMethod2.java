package array;

public class StaticMethod2 {
    
	public static String method;
	public int no1;
	public int no2;
	
	
	public static void main(String[] args) {
		//static call kr
		StaticMethod2.sum();
		StaticMethod2.method="berij";
		System.out.println(method);
		
		
	//non static kr
		StaticMethod2 obj= new StaticMethod2();
		obj.no1=15;
		obj.no2=20;
		
		int c= obj.no1+obj.no2;
		System.out.println(obj.no1+obj.no2);
		
	}
	
	public static void sum()
	{
		System.out.println("sum");
	}
	public void sub()
	{
		System.out.println("sub");
	}

}
