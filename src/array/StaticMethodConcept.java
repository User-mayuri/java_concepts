package array;

public class StaticMethodConcept {
	
	public static String name;
	public int age;
	
	public static void getInfo()
	{
		System.out.println("getinfo");
	}
	public void sendMail()
	{
		System.out.println("send mail");
	}

	public static void main(String[] args) {
		//call static var and method:
		//1.by using class name:
		StaticMethodConcept.name="Tom";
		System.out.println(StaticMethodConcept.name);
		
		StaticMethodConcept.getInfo();
		
		//call non static method:create the object
		StaticMethodConcept obj= new StaticMethodConcept();
		obj.age=18;
		obj.sendMail();
		
		//can access static var and methods using ref pbj names ,but with warning: not recommend 
		System.out.println(name);
		obj.getInfo();
		
		//can i access static var and method directly
		System.out.println(name);
		getInfo();
		

	}

}
