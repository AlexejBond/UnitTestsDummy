package suiteJUnit;

import testedClasses.Calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;


public class CalculatorJUnitTests {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        Assert.assertEquals("The sum result is wrong", 7, calculator.add(3, 4));
        System.out.println("JUnit: Testing sum method - Passed !");
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        Assert.assertEquals("The subtract result is wrong", -7, calculator.subtract(1, 8));
        System.out.println("JUnit: Testing subtract method - Passed !");
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        Assert.assertEquals("The multiply result is wrong", 36, calculator.multiply(6, 6));
        System.out.println("JUnit: Testing multiply method - Passed !");
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        Assert.assertEquals("The divide result is wrong", 5, calculator.divide(25, 5));
        System.out.println("JUnit: Testing divide method - Passed !");
    }


}
