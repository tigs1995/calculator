package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
	String op = null;
	double num1;
	double num2;
	double answer;

	public Calculator(String s) {
		getOperation(s);
		System.out.println(calc());
	}

	public void getOperation(String s) {
		Pattern pattern = Pattern.compile("(\\d*)(.)(\\d*)");
		Matcher matcher = pattern.matcher(s);

		while (matcher.find()) {
			this.num1 = Integer.parseInt(matcher.group(1).toString());
			this.num2 = Integer.parseInt(matcher.group(3).toString());
			this.op = matcher.group(2);
			System.out.println(this.num1);
			System.out.println(this.num2);
			System.out.println(this.op);
		}

	}

	public double calc() {
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
