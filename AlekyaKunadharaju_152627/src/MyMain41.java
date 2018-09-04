
import java.io.BufferedReader;
public class MyMain41 {

	public static void main(String[] args)
	{
	  Person41 per1=new Person41();
	  Person41 per2=new Person41();
	  Account41 acc1=new Account41();
	  Account41 acc2=new Account41();
	  
	  per1.setName("Smith");
	  per1.setAge(35);
	  
	  per2.setName("Kathy");
	  per2.setAge(25);
		
	  System.out.println("Intial amount in Smith's account:2000");
	  System.out.println("Intial amount in Kathy's account:3000");
	  acc1.setBalance(2000);
	  
	  acc1.getAccNum();
	  acc2.getAccNum();
	  
	  acc1.withDraw(2000);
	  acc2.Deposit(2000);
		
	  System.out.println(per1);
	  System.out.println(per2);
	  System.out.println(acc1);
	  System.out.println(acc2);
			
	}
}







