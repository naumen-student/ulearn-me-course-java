package com.example.task04;

public class Task04 {

	public static double calculate(int a, int b, String operation) {

		switch (operation) {
		case "/":
			return (double)a/b;
		case "-":
			return (double)a-b;
		case "+":
			return (double)a+b;
		case "*":
			return (double)a*b;
		default:
			return 0;
		
		}
	}

	public static void main(String[] args) {

		double result = calculate(-25, 5, "/");
		System.out.println(result);

	}

}
