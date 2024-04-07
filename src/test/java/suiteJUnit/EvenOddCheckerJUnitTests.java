package suiteJUnit;

import org.junit.Test;
import testedClasses.EvenOddChecker;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EvenOddCheckerJUnitTests {

    @Test
    public void testEvenNumber() {
        assertTrue("Inputted number (20) is not even", EvenOddChecker.check(20));
        System.out.println("Inputted number (20) is even, JUnitTest: Passed !");
    }

    @Test
    public void testOddNumber() {
        assertFalse("Inputted number (7) is not odd", EvenOddChecker.check(7));
        System.out.println("Inputted number (7) is odd, JUnitTest: Passed !");
    }
}




