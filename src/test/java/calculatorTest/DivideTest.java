package calculatorTest;

import org.junit.Assert;
import org.junit.Test;

import calculator.Calculator;
import calculator.Divide;

public class DivideTest {

	@Test
	public void divideTest() {
		Divide divide = new Divide();
		double divTest = Divide.getResult(10, 2);
		double divTest2 = Divide.getResult(-10, 2);
		//double divTest3 = Divide.getResult(6,7);
		Assert.assertEquals(5.0, divTest, 0);
		Assert.assertEquals(-5.0, divTest2, 0);
		//Assert.assertEquals(0.8571428571, divTest3, 0);
		
	}

}
