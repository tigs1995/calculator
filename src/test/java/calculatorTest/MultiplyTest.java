package calculatorTest;

import org.junit.Assert;
import org.junit.Test;

import calculator.Multiply;

public class MultiplyTest {

	@Test
	public void test() {
		Assert.assertEquals(0, Multiply.getResult(10, 0), 0.0001);
		Assert.assertEquals(0, Multiply.getResult(0, 10), 0.0001);
		Assert.assertEquals(0, Multiply.getResult(0, 0), 0.0001);
		Assert.assertEquals(100, Multiply.getResult(10, 10), 0.0001);
		Assert.assertEquals(6.25, Multiply.getResult(2.5, 2.5), 0.0001);
		Assert.assertEquals(50, Multiply.getResult(100, 0.5), 0.0001);
		Assert.assertEquals(25, Multiply.getResult(100, 0.25), 0.0001);
		Assert.assertEquals(-100, Multiply.getResult(100, -1), 0.0001);
	}
}