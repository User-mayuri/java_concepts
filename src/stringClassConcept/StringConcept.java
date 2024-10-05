package stringClassConcept;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringConcept {
	
	public static void main(String args[])
	{
//	   String str="hello this is my java code and i am so happy";
//	   
//	   System.out.println(str.length());
//	   
//	  System.out.println(str.charAt(0));
//	  
//	  System.out.println(str.indexOf("l"));
//	  
//	  System.out.println(str.indexOf("i",str.indexOf("i")+1)+1);
//	  
//	  String name="Mayuri suresh Bute";
//	  
//	  System.out.println(name.indexOf("suresh"));
//	  
//	  String pop="javascript:python:c++:ruby";
//	  
//	  String p[]=pop.split(":");
//	  
//	 System.out.println(p[3]);
//	 
//	 System.out.println(p.length);
//	  
//	 String newWord="i:love:you";
//	  String pp=newWord.replace(":", ",");
//	  
//	  System.out.println(pp);
//	  
//	  String word="mayari";
//	  String word1=word.replaceAll("a","*");
//	  System.out.println(word1);
	  
      String domain = "    hello    selenium    ";
      String dom = domain.replaceAll("\\s+", "");
      System.out.println(dom);

      String t1 = "your order id is 12345";
      String orderId = t1.replaceAll("\\D+", "");
      System.out.println(orderId);

	  
	  }

}
