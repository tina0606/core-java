
public class Person53 extends Account53
{

	@Override
	public void withdraw(double a) {
		// TODO Auto-generated method stub
	
		if(balance>a)
		{
			balance=balance-a;
			
		}
		else {
			System.out.println("cannot withdraw");
		}
	}
	String name;
	int age;
	double balance;
	public Person53() {
		
	}

	public Person53(String name, int age, double balance) {
		super();
		this.name = name;
		this.age = age;
		this.balance = balance;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
  @Override
	public String toString() {
		return "Person53 [name=" + name + ", age=" + age + ", balance=" + balance + "]";
	}

	@Override
	public void deposit(double a) {
		// TODO Auto-generated method stub
		balance= balance+a;
	}

	
	
	
	
	
	
}
