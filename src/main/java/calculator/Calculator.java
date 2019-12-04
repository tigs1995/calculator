package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
	private String op = null;
	private double num1;
	private double num2;
	private double answer;

	public Calculator(String s) {
		getOperation(s);
		System.out.print(calc());
	}

	public void getOperation(String s) {
		Pattern pattern = Pattern.compile("(\\d*)(.)(\\d*)");
		Matcher matcher = pattern.matcher(s);

		while (matcher.find()) {
			this.num1 = Integer.parseInt(matcher.group(1).toString());
			this.num2 = Integer.parseInt(matcher.group(3).toString());
			this.op = matcher.group(2);
			System.out.print(this.num1 + " ");
			System.out.print(this.op + " ");
			System.out.print(this.num2);
			System.out.print(" = ");
			
		}

	}

	public double calc() { // Not good practice, will have to edit this swtich with every new operation.
		switch (this.op) {
		case "+":
			this.answer = Add.getResult(num1, num2);
			break;
		case "-":
			this.answer = Subtract.getResult(num1, num2);
			break;
		case "/":
			this.answer = Divide.getResult(num1, num2);
			break;
		case "*":
			this.answer = Multiply.getResult(num1, num2);
			break;
		case "%":
			this.answer = Remainder.getResult(num1, num2);
			break;
		default:
			System.out.println("Invalid operator");
			this.answer = 0;
			break;
		}
		return this.answer;
	}
}