import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program25 {
	public enum Gender {
		M, F, m, f;
	}

	public static void main(String[] args) {
		PersonMain pp = new PersonMain();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Printing the details");

		System.out.println("enter first name");
		try {
			String firstName = br.readLine();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		System.out.println("enter last name");
		try {
			String lastName = br.readLine();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println("gender");
		char gender = 0;
		try {
			gender = br.readLine().charAt(0);
		} catch (IOException e) {

			outer: while (true) {
				for (Gender g : Gender.values()) {
					if (gender == (g.name().charAt(0))) {
						break outer;
					}

				}

				System.out.println("Wrong gender please try again");
				try {
					gender = br.readLine().charAt(0);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}

	}

}
