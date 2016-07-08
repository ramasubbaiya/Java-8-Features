package com.example.java8;

public class JoinerMethod {

	public static void main(String[] args) {
		String stringComma = String.join(", ", "Rama", "Raj");
		System.out.println(stringComma);
		
		String provinces[] = {"Ontario", "BC", "Nova Scotia", "Alberta"};
		String provincesList = String.join(", ", provinces);
		
		System.out.println(provincesList);
	}		
}
