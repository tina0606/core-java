
public class Current42 extends Account42{

	final double draftlimit=5000;
	public Current42()
	{
		
	}
	public Current42(String name,double bal,float age)
	{
		this.name=name;
		this.bal=bal;
		this.age=age;	
	}
	public void withdraw(double d)
	{
		double b=bal;
		b=-d;
		if(bal>=draftlimit)
		{
			System.out.println("reached draft limit");
		}
		else
		{
			bal=-b;
		}
	}
	@Override
	public String toString() {
		return "Current42 [name=" + name + ", bal=" + bal + ", age=" + age + "]";
	}
	
	}
	
	
	
	

