package calculatorTest;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import calculator.Add;

public class AddTest {

	Add add = new Add();

	@Test
	public void test() {
		Assert.assertEquals((add.getResult(5,5)), 10, 0.00005);
		Assert.assertNotEquals((add.getResult(5, 5)), 11, 0.00005);
	}

}
