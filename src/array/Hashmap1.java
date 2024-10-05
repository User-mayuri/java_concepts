package array;

import java.util.HashMap;

public class Hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashMap <String,Integer>map=new HashMap<String,Integer>();
    map.put("mayuri", 101);
    map.put("pinki", 202);
    map.put("house", 302);
    
    System.out.println(map);
    
    System.out.println(map.get("mayuri"));
    System.out.println(map.get("pinki"));
    
    map.remove("pinki");
    System.out.print(map);
	}

}
