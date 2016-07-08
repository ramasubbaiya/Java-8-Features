package com.example.javase8;

import com.example.javase8.interfaces.SimpleInterfaceWithArgs;

public class UseSimpleInterfaceWithArgs {

	public static void main(String[] args) {
		
		SimpleInterfaceWithArgs obj = (v1, v2) -> {
			int result = v1 * v2;
			System.out.println("Result value : " + result);
		};
		
		obj.calculateMe(10, 5);
		
	}

}
