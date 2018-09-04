import java.util.Scanner;

public class Program37
{
	public static void main(String[] args)
	{
		System.out.println("Enter the name");
		System.out.println(isvalid());
		
	}
  static boolean isvalid()
  {
     Scanner sc=new Scanner(System.in);
     String name=sc.next();
     String substr="_job";
     String username=name+substr;
     if(username.length() >=8 && name.length()>=12)
     {
    	 if(name.endsWith("_job"))
    	 { return true;
    	 }		 
     }
	return false;
     

}
}