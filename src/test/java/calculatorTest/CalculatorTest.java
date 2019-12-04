package calculatorTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import calculator.Calculator;

// Imported and used some wild stuff because I had to assert console outputs.

public class CalculatorTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@After
	public void restoreStreams() {
	    System.setOut(originalOut);
	    System.setErr(originalErr);
	}

	@Test
	public void testAdd() {
		new Calculator("3+5");
		Assert.assertEquals("3.0 + 5.0 = 8.0", outContent.toString());
	}
	
	@Test
	public void testSubtract() {
		new Calculator("3-5");
		Assert.assertEquals("3.0 - 5.0 = -2.0", outContent.toString());
	}
	
	@Test
	public void testMultiply() {
		new Calculator("3*5");
		Assert.assertEquals("3.0 * 5.0 = 15.0", outContent.toString());
	}
	
	@Test
	public void testDivide() {
		new Calculator("3/5");
		Assert.assertEquals("3.0 / 5.0 = 0.6", outContent.toString());
	}
	
	@Test
	public void testRemainder() {
		new Calculator("16%5");
		Assert.assertEquals("16.0 % 5.0 = 1.0", outContent.toString());
	}

}
