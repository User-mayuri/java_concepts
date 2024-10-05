import java.util.Arrays;

public class ArrayNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {1,5,8,9,3,6,8};
        System.out.println(Arrays.toString(a));
//        for(int i=0;i<a.length;i++)
//        {
//        	System.out.println(a[i]);
//        	a[3]=100;
//        	System.out.println(a[i]);
//        }
//        
        String str[]= {"mayuri","suresh","bute"};
        for(int i=0;i<str.length;i++)
        {
        	System.out.println(str[i]);
        }
        
        char ch[]=new char[5];
        ch[0]='a';
        ch[1]='e';
        ch[2]='i';
        ch[3]='o';
        ch[4]='u';
        
        for(int i=0;i<ch.length;i++)
        {
        	System.out.println(ch[i]);
        }
        
        int z[]= {1,5,8,7};
        for( int e:z)
        {
        	System.out.println(e);
        }
        
        String app[]= {"amazon","fp","nile"};
        for(String e:app)
        {
        	System.out.println(e);
        }
        
        
	}

}
