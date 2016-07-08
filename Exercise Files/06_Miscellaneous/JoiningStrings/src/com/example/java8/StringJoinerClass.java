package com.example.java8;

import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeSet;

public class StringJoinerClass {
	
	public static void main(String[] args) {
		
//		Creating a StringJoiner
		StringJoiner sj = new StringJoiner(", ", "{ ", " }");
		sj.setEmptyValue("I am trimmed");
		System.out.println(sj);
		
		sj.add("Alberta")
		  .add("British Columbia")
		  .add("Ontario");
		
		System.out.println(sj);
		
//		Merging StringJoiner instances
		StringJoiner sj2 = new StringJoiner(", ");
		sj2.add("Quebec");
		
		sj.merge(sj2);
		
		System.out.println(sj);
		
//		Working with collections
		Set<String> set = new TreeSet<>();
		set.add("California");
		set.add("Oregon");
		set.add("Washington");
		StringJoiner sj3 = new StringJoiner(" and ");
		set.forEach(s -> sj3.add(s));
		
		System.out.println(sj3);

	}
	
}
