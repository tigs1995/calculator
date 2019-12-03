package calculatorTest;

import org.junit.Assert;
import org.junit.Test;

import calculator.Multiply;

public class MultiplyTest {



	@Test
	public void test() {
		Multiply multiplyTest = new Multiply();
		Assert.assertEquals(0, multiplyTest.getResult(10,0), 0 );
		Assert.assertEquals(0, multiplyTest.getResult(0,10), 0 );
		Assert.assertEquals(0, multiplyTest.getResult(0,0), 0 );
		Assert.assertEquals(0, multiplyTest.getResult(10,10), 100 );
		Assert.assertEquals(0, multiplyTest.getResult(2.5,2.5), 6.25 );
		Assert.assertEquals(0, multiplyTest.getResult(100,0.5), 50 );
		Assert.assertEquals(0, multiplyTest.getResult(100,1/4), 25 );

	}
}