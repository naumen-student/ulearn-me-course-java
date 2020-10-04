package com.example.task02;

public class Task02Main {
	public static void main(String[] args) {

		System.out.println(getSeason(9));

	}

	static String getSeason(int monthNumber) {
		if (monthNumber == 12 || monthNumber < 3) {
			return "зима";
		} else if (monthNumber < 6) {
			return "весна";
		} else if (monthNumber < 9) {
			return "лето";
		} else if (monthNumber < 12) {
			return "осень";
		}
		return "";

	}
}
