package array;

public class Name {
	
	String fname;
	String lname;

	Name(String fname,String lname)
	{
		this.fname=fname;
		this.lname=lname;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Name my=new Name("Mayuri","Bute");
         System.out.println(my.fname);
         System.out.println(my.lname);
         
	}

}
