package OOP_Inheritance;

public class Honda extends Car {
	 public void start() {
		 System.out.println("Honda-start");
	 }
    public void fuelEff()
    {
    	System.out.println("Honda--fuel eff");
    }
    public void parking()
    {
    	BMW b=new BMW();
        b.autoParking();//composition
    }
}
