package stringClassConcept;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="Mayuri";
    int counter[]=new int[256];
    int len;
    
    len = str.length();
    
    for(int i=0;i<len;i++)
    {
    	counter[(int)str.charAt(i)]++;
    }
    
for(int i=0;i<256;i++)
{
	if(counter[i]!=0)
	{
		//System.out.println((char)i+" "+counter[i]);
		System.out.println((char)i+"->"+counter[i]);
	}
}
}
}
