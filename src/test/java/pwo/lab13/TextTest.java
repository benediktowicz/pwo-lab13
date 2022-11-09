package pwo.lab13;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TextTest {

    public TextTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of cont5Dig method, of class Text.
     */
    @Test
    public void testCont5Dig() {
        System.out.println("cont5Dig");
        String str = "";
        boolean expResult = false;
        boolean result = Text.cont5Dig(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of numberCount method, of class Text.
     */
    @Test
    public void testNumberCount() {
        System.out.println("numberCount");
        String str = "";
        int expResult = 0;
        int result = Text.numberCount(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of noDigits method, of class Text.
     */
    @Test
    public void testNoDigits() {
        System.out.println("noDigits");
        String str = "";
        boolean expResult = false;
        boolean result = Text.noDigits(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onlyDigits method, of class Text.
     */
    @Test
    public void testOnlyDigits() {
        System.out.println("onlyDigits");
        String str = "";
        boolean expResult = false;
        boolean result = Text.onlyDigits(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
