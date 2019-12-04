package calculatorTest;

import org.junit.Assert;
import org.junit.Test;

import calculator.Remainder;

public class RemainderTest {

	@Test
	public void test() {
		//Remainder remainder = new Remainder(); // Static methods don't need an instance to call from.
		//Assert.assertEquals(1.0, remainder.getResult(1, 4), 0.00001);
		Assert.assertEquals(1.0, Remainder.getResult(1, 4), 0.00001);
	}

}
