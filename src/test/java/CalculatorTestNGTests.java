import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTestNGTests {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.add(3, 4), 7, "The sum result is wrong");
        System.out.println("TestNG: Testing sum method - Passed !");
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.subtract(1, 8), -7, "The subtract result is wrong");
        System.out.println("TestNG: Testing subtract method - Passed !");
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.multiply(6, 6), 36, "The multiply result is wrong");
        System.out.println("TestNG: Testing multiply method - Passed !");
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.divide(25, 5), 5, "The divide result is wrong");
        System.out.println("TestNG: Testing divide method - Passed !");
    }
}
