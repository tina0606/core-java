import java.util.Scanner;

class Program231 {
	private String firstName;
	private String lastName;
	private char gender;
	private String phone;
	public Program231(String firstName, String lastName, char gender)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getphone() {
		return phone;
	}
	public void setphone(String phone) {
		this.phone = phone;
	}

   public void method()
   {
	   System.out.println("enter mobile number");
	   Scanner sc=new Scanner(System.in);
	   phone=sc.next(); 
   }
  
    @Override
public String toString() {
	return "Program23 [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", phone=" + phone
			+ "]";
}
}
	public class Program23
   {
    	public static void main(String[] args)
	   {
	   
		 Program231 p=new Program231("Alekya","Raju",'F');
		   p.method();
		   		   System.out.println(p);
	   }   
   }
   

   


   


