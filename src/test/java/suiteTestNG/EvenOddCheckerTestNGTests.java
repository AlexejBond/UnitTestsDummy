package suiteTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import testedClasses.EvenOddChecker;

public class EvenOddCheckerTestNGTests {

    @Test
    public void testEvenNumber() {
        boolean result = EvenOddChecker.check(20);
        Assert.assertTrue(result, "Inputted number (20) is not even");
        System.out.println("Inputted number (20) is even, TestNGTest: Passed !");
    }

    @Test
    public void testOddNumber() {
        boolean result = EvenOddChecker.check(7);
        Assert.assertFalse(result, "Inputted number (7) is not odd");
        System.out.println("Inputted number (7) is odd, TestNGTest: Passed !");
    }
}