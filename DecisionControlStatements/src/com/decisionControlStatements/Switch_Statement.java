package com.decisionControlStatements;

import java.util.Scanner;

public class Switch_Statement {
	static int a = 10;
	static int b = 5;

	public static void add() {
		System.out.println(a + b);
	}

	public static void sub() {
		System.out.println(a - b);
	}

	public static void mul() {
		System.out.println(a * b);
	}

	public static void div() {
		System.out.println(a / b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("select operation");
		System.out.println("1.add  2.sub  3.mul  4.div");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			add();
			break;
		case 2:
			sub();
			break;
		case 3:
			mul();
			break;
		case 4:
			div();
			break;
		default:
			System.out.println("Invalid option");
		}
	}

}
