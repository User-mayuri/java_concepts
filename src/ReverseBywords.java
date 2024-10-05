
public class ReverseBywords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="I am mayuri";
    //  String nstr=" ";
       char ch;
       String[] nstr=str.split(" ");
       for(int i=nstr.length-1;i>=0;i--)
       {
    	   System.out.println(nstr[i]);
    		
       }
     // System.out.println(nstr);
	}

}
