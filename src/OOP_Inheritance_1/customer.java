package OOP_Inheritance_1;

public class customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mall sgs= new Mall();
		sgs.entrance();
		sgs.parking();
		sgs.washroom();
		
		System.out.println("-------------------");
		decathlon shop=new decathlon();
		shop.entrance();
		shop.parking();
		shop.washroom();
				

		shop.clothes();
		shop.bra();
		shop.jacket();
		
		System.out.println("-------------------------");

		Mall.mallName();
	}
	

}
