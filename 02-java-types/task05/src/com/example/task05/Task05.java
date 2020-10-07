package com.example.task05;

public class Task05 {

	public static String solution(int x) {
		String str = String.valueOf(x);
		Boolean b = false;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) % 2 != 0) {
				return "FALSE";
			}
		}
		return "TRUE";
	}

	public static void main(String[] args) {

		String result = solution(1234);
		System.out.println(result);

	}

}
