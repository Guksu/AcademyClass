package org.min.ex;

public class Ex04_for {
	public static void main(String[] args) {

		for(int i = 0; i<4; i++) {
			System.out.println("*");
		}
		
		System.out.println("-------");

		for(int i = 0; i<4; i++) {
			System.out.print("*");
		}
		
		System.out.println("");
		System.out.println("-------");
		
		for(int x = 0; x<4; x++) {
			for(int i = 0; i<4; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("-------");
		
		for(int x = 0; x<5; x++) {
			for(int i = 0; i<x; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
