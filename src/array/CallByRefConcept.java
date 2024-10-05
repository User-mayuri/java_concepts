package array;

public class CallByRefConcept {
	
	String name;
	int age;
	
	public static void getInfo(CallByRefConcept t1)
	{
		System.out.println(t1.name);
		System.out.println(t1.name);
		
		t1.name="Tom";
		t1.age=35;
		
		System.out.println(t1.name);
		System.out.println(t1.age);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	CallByRefConcept obj=new CallByRefConcept();
	obj.name="Prateek";
	obj.age=30;
	
	getInfo(obj);//call by ref
	
	System.out.println(obj.name);
	System.out.println(obj.age);
		
     
	}

}
