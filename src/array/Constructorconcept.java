package array;

public class Constructorconcept {

   int age;
   int salary;
   int amount;
   
   public Constructorconcept(int age,int salary,int amount)
   {
	   this.age=age;
	   this.salary=salary;
	   this.amount=amount;
	   
   }
   public static void main(String[] args)
   {
	   Constructorconcept t1=new Constructorconcept(10,10,10);
	   System.out.println(t1.age);
   }
}
