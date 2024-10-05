package Assignments;

public class switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String testcase="Login";
   
   switch(testcase)
   {
   case "qa":
	   System.out.println("running on qa");
   case "dev":
	   System.out.println("running on dev");
	   break;
	   
	   default:
		   System.out.println("running on prod");
	}
   

}
}
