
public abstract class test2 {
	
	public abstract void test3();
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str="moma";
         char ch;
         String nstr="";
         for(int i=0;i<str.length();i++)
         {
        	 ch=str.charAt(i);
        	 nstr=nstr+ch;
        	
         }
         System.out.println(str+nstr);
  if(str==nstr)
  {
       System.out.println("it is palindrome"+nstr);
       
       

	}
  else
  {
	  System.out.println(nstr);
  }
}
}
//malayalam

