package calculatorTest;

import org.junit.Assert;
import org.junit.Test;

import calculator.Remainder;

public class RemainderTest {

	@Test
	public void test() {
		Remainder remainder = new Remainder();
		Assert.assertEquals(1.0, remainder.getResult(1, 4), 0.00001);
	}
	
	//adding a commit

}
