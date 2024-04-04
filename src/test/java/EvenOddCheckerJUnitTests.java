import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EvenOddCheckerJUnitTests {

    @Test
    public void testEvenNumber() {
        assertTrue("Inputted number is not even", EvenOddChecker.check(20));
        System.out.println("JUnit: Passed !");
    }

    @Test
    public void testOddNumber() {
        assertFalse("Inputted number is not odd", EvenOddChecker.check(7));
        System.out.println("JUnit: Passed !");
    }
}




