package array;

public class MethodChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodChaining obj= new MethodChaining();
		obj.m1();
		
		MethodChaining.t1();

	}
	
	public void m1()
	{
		System.out.println("m1 method");
		m2();
		
	}
	public void m2()
	{
		System.out.println("m2 method");
		m3();
	}
    public void m3()
    {
    	System.out.println("m3 method");
    }
    
    public static void t1() {
    	System.out.println("ti method");
    	t2();
    	MethodChaining obj1=new MethodChaining();
    	obj1.m1();
 }
    public static void t2()
    {
    	System.out.println("t2 method");
    }
}

//to call non static from main- Create onject
//to call static method from main- classname.method
//to call from ns to ns - method name direct
//static to static -method name direct

//s - s --> class name.method name/directly
//NS -- NS --> directly
//s - NS --> create the object
//NS -- s --> class name.method name/directly

//m -- s --> class name.method name/directly
//m -- NS --> create the object


