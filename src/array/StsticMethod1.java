package array;

public class StsticMethod1 {

	public static void main(String[] args) {
		//static obj n method call karaychi
		
		System.out.println(name);
		StsticMethod1.employee();
		
		//non static call karaych
		StsticMethod1 obj= new StsticMethod1();
		obj.age=50;
		obj.manager();
		
		
        
	}
	
	public static String name="Mayuri";
	public int age;
	
	public static void employee() {
		System.out.println("Hello");
	}
	public void manager()
	{
		System.out.println("Murali");
	}

}
