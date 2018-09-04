
public class Account41 {
	private long accNum;
	private double balance;
	Person41 accHolder;
	
	public long getAccNum() {
		return accNum=(long)(Math.random() *10000+40000);
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person41 getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person41 accHolder) {
		this.accHolder = accHolder;
	}
	
	public Account41()
	{
		
	}
	public Account41(long accNum, double balance, Person41 accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	@Override
	public String toString() {
		return "Account41 [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	}

	
	public void Deposit(double amount)
	{  
		balance=balance+amount;
		
	}
	public void withDraw(double amount)
	{
		if(balance<500)
			System.out.print("Insufficient balance");
		balance=balance-amount;
		
	}
}
