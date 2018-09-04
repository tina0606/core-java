import java.util.Scanner;

public class AgeException extends Exception
{
private int age;
AgeException(int a)
{
	age=a;
	
}
@Override
public String toString() {
	return age+"is an invalid age";
}
}
class emp
{
	String name;
	int age;
	void getDetails()throws AgeException
	{
		System.out.println("Enter your name");
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		System.out.println("Enter your age:");
		age=sc.nextInt();
		if(age<16)
			throw new AgeException(age);
	}}
class ExceptionDemo
{
	public static void main(String args[])
	{
		try {
			emp e=new emp();
			e.getDetails();
		}catch(Exception  e)
		{
			System.out.println(e);
			
		}

	}
}
