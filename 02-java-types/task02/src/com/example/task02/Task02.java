package com.example.task02;

public class Task02 {

	public static String solution(String input) {

		try {
			Byte i = Byte.parseByte(input);
			return "byte";
		} catch (Exception e) {
		}
		try {
			Short i = Short.parseShort(input);
			return "short";
		} catch (Exception e) {
		}
		try {
			Integer i = Integer.parseInt(input);
			return "int";
		} catch (Exception e) {
		}
		try {
			long i = Long.parseLong(input);
			return "long";
		} catch (Exception e) {
		}
		return "Данные не подходят условию";
	}

	public static void main(String[] args) {

		String result = solution("2500000000");
		System.out.println(result);

	}

}
