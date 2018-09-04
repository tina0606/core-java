class Person {
	private String firstName;
	private String lastName;
	private char gender;
	
	public Person(String firstName, String lastName, char gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public char getGender() {
		return gender;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
 }
	class PersonMain{
		
		public static void main(String[] args)
		{
		Person p=new Person("Alekya","Raju",'F');
		System.out.println(p.getFirstName());
		System.out.println(p.getLastName());
		System.out.println(p.getGender());
		}
		
	
 }

