import java.util.Scanner;

public class Program32
{
	
	public static void main (String[] args)
	{
		String s1;
		System.out.println("Enter your name");
		Scanner sc=new Scanner(System.in);
		s1=sc.next();
	
		System.out.println(alphabeticalOrder(s1.toLowerCase()));	
	}

	public static boolean alphabeticalOrder(String s1) 
	{
		
	  for(int i=0;i<s1.length()-1;i++)
		if(s1.charAt(i)>s1.charAt(i+1))
		{
		return false;
		}
 return true;
	}
}