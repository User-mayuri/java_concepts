package array;

public class TestingConstructor {

	String name;
	int days;
	
	TestingConstructor(String n,int d)
	{
		name=n;
		days=d;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestingConstructor t1 =new TestingConstructor("api",3);
	    System.out.println(t1.name);
		
		
	}

}
