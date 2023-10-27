package com.example.java8.features.anonymoues.classes;

public class AnonymousClassTest {

	public static void main(String[] args) {
	
		/*
		 * Anonymous obj = new Anonymous() {
		 * 
		 * public void show() {
		 * 
		 * System.out.println("Hello Anonymous!!..."); }
		 * 
		 * @Override public void display() {
		 * 
		 * System.out.println("Hello Anonymous!!..."); } };
		 * 
		 * obj.show(); obj.display();
		 */
		
		Anonymous anonymous = (a,b) -> {
			System.out.println(a+b);
			return a+10; 
		};
		
		System.out.println(anonymous.show(10,20));
	}
	
}
