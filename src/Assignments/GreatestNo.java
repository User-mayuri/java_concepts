package Assignments;

public class GreatestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=100;
		int b=200;
		int c=800;
		int d=1000;
		
		if(a>=b && a>=c && a>=d)
		{
			System.out.println("a is greater no"+a);
		}
		else if(b>=a && b>=c && b>=d)
		{
			System.out.println("b is greater no"+b);
		}
		else if(c>=a && c>=b && c>=d)
			System.out.println(c+"is large no");
		
		else
		{
			System.out.println(d+"d is larger");
		}
	}

}
