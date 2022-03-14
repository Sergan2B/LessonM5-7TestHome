package kg.geektech.lessonm5_7test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PasswordUtilTest {

    private PasswordUtils passwordUtils;

    @Before
    public void setup() {
        passwordUtils = new PasswordUtils();
    }

    @Test
    public void moreSicSymbols() {
        assertFalse(passwordUtils.isStrongPassword("A1"));
        //assertFalse(passwordUtils.isStrongPassword("Password14"));

        assertTrue(passwordUtils.isStrongPassword("Password1467"));
    }

    @Test
    public void haveOneDigit() {
        assertFalse(passwordUtils.isStrongPassword("Password"));
        assertTrue(passwordUtils.isStrongPassword("Password14"));
        assertTrue(passwordUtils.isStrongPassword("Password145135i21jo3oisd"));
    }

    @Test
    public void haveCapsLetter() {
        assertFalse(passwordUtils.isStrongPassword("password1"));
        assertTrue(passwordUtils.isStrongPassword("paSsword1432dS"));
        assertTrue(passwordUtils.isStrongPassword("PASSWORD1424"));
    }

    @After
    public void tearDown() {
        passwordUtils = null;
    }
}
