import java.util.Scanner;

public class Program1021 {
	private String firstName;
	private String lastName;
	private char gender;
	
	public Program1021(String firstName, String lastName, char gender)
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
	

  
  


    	public static void main(String[] args)
	   {
	   
		 Program1021 p=new Program1021("Rahul","Raju",'M');
		   p.method();
		   		   System.out.println(p);
	   }
		private void method() {
			// TODO Auto-generated method stub
			
		}   
 
   

   
}


