package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b=new BMW();
		b.start();//overridden
		b.stop();//inherited
		b.refuel();//inherited
		b.autoParking();//individual
		b.engine();//inherited
		b.billing();//overridden
		
		System.out.println(b.maxSpeed);
		
		//static method mhnun obj banvaychi garaj nahi 
		Car.carDisplay();
		BMW.carDisplay();
		
		
		System.out.println(Car.price);
		System.out.println(BMW.price);
		
		//final var and method:
		b.RunFourWheels();
		System.out.println(b.minSpeed);
		

		Car.loadCar();
		BMW.loadCar();
		
	    b.showCar();
		
		System.out.println("--------");
        
		Audi au = new Audi();
		au.start();//inherited
		au.stop();//inherited
		au.refuel();//inherited
		au.theftSafety();//individual
		au.engine();//overridden
		au.billing();
		System.out.println(au.maxSpeed);
		
		System.out.println("------------");
		
		Honda h=new Honda();
	    h.stop();
		h.refuel();
		h.start();
		h.fuelEff();
		h.parking();
		
		System.out.println("------");
		
		Car c1=new Car();
		c1.start();
		c1.stop();
		c1.refuel();
		
		Vehicle v2= new Honda();
		v2.start();
		
		Honda h2=(Honda)new Vehicle();
		
			
				
		Car c4= new BMW();
		
		
	}

}
