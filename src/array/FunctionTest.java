package array;

public class FunctionTest {

	public static void main(String[] args) {
       
		FunctionTest obj=new FunctionTest();
		int m1=obj.getMarks("devika");
		System.out.println(m1);
	     
		if(m1==-1)
		{
			
		}

	}
	public int getStudentMarks(String studentName)
	{
		System.out.println("getting marks for student: "+studentName);
        
		int marks=-1;
		if(studentName.trim().equalsIgnoreCase("devika")) {
			marks=90;
		}
		else if(studentName.equalsIgnoreCase("ravi"))
		{
			marks=95;
		}
		else if(studentName.equalsIgnoreCase("mayuri"))
		{
			marks=10;
		}
		else {
			System.out.println("student name not found plz pass right name"+studentName);
		}
		return marks;
	}
	public int getMarks(String studentName) {
		System.out.println("getting marks for student "+studentName);
		
		switch(studentName.toLowerCase().trim())
		{
		case "devika":
			return 95;
		case"ravi":
			return 90;
		case"naveen":
			return 10;
			
			default:
				System.out.println("students name not found");
				return -1;
		}
	}
}
