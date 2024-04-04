import org.testng.Assert;
import org.testng.annotations.Test;

public class EvenOddCheckerTestNGTests {

    @Test
    public void testEvenNumber() {
        boolean result = EvenOddChecker.check(20);
        Assert.assertTrue(result, "Inputted number is not even");
        System.out.println("TestNG: Passed !");
    }

    @Test
    public void testOddNumber() {
        boolean result = EvenOddChecker.check(7);
        Assert.assertFalse(result, "Inputted number is not odd");
        System.out.println("TestNG: Passed !");
    }
}