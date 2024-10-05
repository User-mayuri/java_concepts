
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="mom";
        String nstr="";
        char ch;
        for(int i=0;i<str.length();i++)
        {
        	ch=str.charAt(i);
        	nstr=ch+nstr;
        }
       // System.out.println(nstr);
        if(str.equals(nstr))
        {
        	System.out.println("it is palinfrome");
        }
        else
        {
        	System.out.println("no palindorme");
        }
	}

}
