package array;

public class Employee {
	
	String name;
	int age;
	double salary;
	boolean isActive;
	char gender;
	
	public Employee()
	{
		System.out.println("emp default system");
	}
	
	public Employee (int i) {
		System.out.println(i);
	}
	
	public Employee(String s,int i)  
	{
		System.out.println(i+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Employee e1= new Employee("naveen",10);
    		   
	}

}
