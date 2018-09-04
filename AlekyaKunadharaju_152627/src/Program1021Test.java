import static org.junit.Assert.*;

import org.junit.Test;

public class Program1021Test {

	@Test
	public void testGetFirstName() {
		String firstname="Rahul";
		assertEquals(firstname,"Rahul");
	}

	@Test
	public void testGetLastName() {
		String lastname="Raju";
		assertEquals(lastname,"Raju");
	}

	@Test
	public void testGetGender() {
		char gender='M';
		assertEquals(gender,'M');
	}

}
