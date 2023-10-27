package com.example.java8.features.lamda.expression;

import java.util.List;
import java.util.stream.Collectors;

public class MainTest {

	public static void main(String[] args) {
		
		System.out.println("main class");
		
		List<Integer> list = List.of(1,2,3,4,5,6);
		
		list.stream().filter(n -> n.equals(n)).collect(Collectors.toList());
		
		System.out.println();
		
		String[] strings = {"Kiran","Mayur","Sagar","Aniket"};
		
		List<String> list2 = List.of(strings);
		
		System.out.println(list2);
		
		System.out.println(list2.stream().filter(n -> n.startsWith("k".toUpperCase())));
	}
	
}
