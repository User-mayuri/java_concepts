package stringClassConcept;

public class StringManupulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="I am mayuri Bute";
      System.out.println(str.toLowerCase());
      
      String str1=" hello world ";
      System.out.println(str1.trim());
      
      String str2="10:09:1995";
      System.out.println(str2.replace(':', '/'));
      
      String top="java test";
      System.out.println(top.replaceAll(" ", "*"));
		
      
      String name="Banana";
      System.out.println(name.replaceAll("a","/"));
	}

}
