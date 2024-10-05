package array;

public  class Student {

	int id;
	String name;
	//creating a parameterized constructor
	Student(int i,String n){
		id=i;
		name=n;
	}
		
	//method to display a value
   void display() {
			System.out.println(id+""+name);
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student(111,"KARTIK");
Student s2=new Student(222,"aryan");

s1.display();
s2.display();
	}

}
