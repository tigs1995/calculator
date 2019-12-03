package calculatorTest;

import org.junit.Assert;
import org.junit.Test;

import calculator.Add;

public class AddTest {

	@Test
	public void test() {
		Assert.assertEquals((Add.getResult(5,5)), 10, 0.00005);
		Assert.assertNotEquals((Add.getResult(5, 5)), 11, 0.00005);
	}

}
