import java.util.Scanner;
public class NameNotFoundExp extends Exception
{
	String firstName;
	 String lastName;
	 char gender;
	 String msg;
	 
	 public NameNotFoundExp()
	 {
		 
	 }

	public NameNotFoundExp( String msg) {
		super();
		this.msg = msg;
	}
	public String toString()
	{
		return msg;
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
	 public static void main(String[] args) throws NameNotFoundExp
	 {
		 Scanner sc=new Scanner(System.in);
		 NameNotFoundExp l=new NameNotFoundExp();
		 
		 try
		 {
			 System.out.println("Enter first name");
			 l.firstName=sc.nextLine();
			 System.out.println("Enter last name");
			 l.lastName=sc.nextLine();
			 if(l.firstName.isEmpty()==true || l.lastName.isEmpty()==true)
			 {
				 throw new NameNotFoundExp("NAME NOT FOUND EXCEPTION");
			 }else
			 {
				 System.out.println("No exception");
			 } }
			 catch(NameNotFoundExp e1) 
			 {
				 System.out.println(e1);
			 }
		 } 
	 
	 }


