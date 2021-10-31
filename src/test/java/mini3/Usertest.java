package mini3;

import sdl.abc.dao.UserDAO;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

public class Usertest {
	@Test
	void regsiterTest() {
		UserDAO dao = new UserDAO();
		assertEquals(1,dao.register("Okker", "Paing", "bc@gmail.com", "123"));
	}
	
	@Test
	void loginTest() {
		UserDAO dao = new UserDAO();
		assertNotEquals(null, dao.login("ada@gmail.com", "123"));
	}
}
