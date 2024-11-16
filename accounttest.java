package lan2;

//import org.junit.jupiter.api.BeforeEach;
 

public class accounttest {

    private Account account;
	private Throwable exception;

   
    public void setUp() {
        account = new Account("testUser", "password123");
    }

    @Test
    public void testCreateAccountWithValidDetails() {
        Account newAccount = new Account("validUser", "securePassword");
        assertEquals("validUser", newAccount.getUsername());
    }

    @Test
    public void testCreateAccountWithInvalidUsername() {
   //    {
   //         new Account("", "securePassword");
        
  //      Throwable exception;
		
       }

    private Exception assertThr1(Class<IllegalArgumentException> class1, Object object) {
		// TODO Auto-generated method stub
		return null;
	}
 

	@Test
    public void testValidatePasswordWithCorrectPassword() {
        assertTrue(account.validatePassword("password123"));
    }

    @Test
    public void testValidatePasswordWithIncorrectPassword() {
        assertFalse(account.validatePassword("wrongPassword"));
    }

    private void assertFalse(boolean validatePassword) {
		// TODO Auto-generated method stub
		
	}

    @Test
    public void testValidatePasswordWithNull() {
    //    assertThrows(IllegalArgumentException.class, () -> account.validatePassword(null));
    }
    @Test
    public void testChangePasswordWithValidDetails() {
        account.changePassword("password123", "newPassword123");
        assertTrue(account.validatePassword("newPassword123"));
    }

    private void assertTrue(boolean validatePassword) {
		// TODO Auto-generated method stub
		
	}

	@Test
 

    private Exception assertThr11(Class<IllegalArgumentException> class1, Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	private Exception assertThr111(Class<IllegalArgumentException> class1, Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	private Exception assertThr1111(Class<IllegalArgumentException> class1, Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	private Exception assertEquals(Class<IllegalArgumentException> class1, Object message) {
		// TODO Auto-generated method stub
		return null;
	}

	private void assertEquals(String string, String message) {
		// TODO Auto-generated method stub
		
	}

	private Exception assertThrows(Class<IllegalArgumentException> class1, Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	
    

	private Exception assertThr(Class<IllegalArgumentException> class1, Object object) {
		// TODO Auto-generated method stub
		return null;
	}
}

