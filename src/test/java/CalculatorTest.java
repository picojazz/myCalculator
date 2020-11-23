import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class CalculatorTest {

    Calculator calculator;
    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }
    @Test
    public void testSum() {
        int result = calculator.sum(14, 2);
        Assert.assertEquals(16, result);
    }

    @Test
    public void testMinus() {
        Assert.assertEquals(10, calculator.minus(17, 7));
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(2, calculator.divide(16, 8));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideWithZero() {
        calculator.divide(6, 0);
    }

    @Test
    public void testMultiply(){
        Assert.assertEquals(14, calculator.multiply(7,2));
    }

    @Test
    public void testMin(){
        int min = calculator.min(3,75);
        Assert.assertEquals(3,min);
    }

    @Test
    public void testMax(){
        int max = calculator.max(25, 39);
        Assert.assertEquals(39,max);
    }

}
