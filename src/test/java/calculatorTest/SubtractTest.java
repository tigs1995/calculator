package calculatorTest;

import org.junit.Assert;
import org.junit.Test;

import calculator.Subtract;

public class SubtractTest {

	@Test
	public void test() {
			Assert.assertEquals(5.5, Subtract.getResult(10.5, 5), 0.0001);
	}

}
