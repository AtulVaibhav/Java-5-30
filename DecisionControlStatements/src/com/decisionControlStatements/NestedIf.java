package com.decisionControlStatements;

import java.util.Scanner;

class DB {
	private static final String storedUsername = "admin";
	private static final String storedPassword = "admin";

	public static String getUsername() {
		return storedUsername;
	}

	public static String getPassword() {
		return storedPassword;
	}

}

public class NestedIf {
	public static void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		String username = sc.next();
		if (username.equals(DB.getUsername())) {
			System.out.println("Username matches");
			System.out.println("Enter password");
			String password = sc.next();
			if (password.equals(DB.getPassword())) {
				System.out.println("Welcome " + username);
			} else {
				System.out.println("Invalid password");
			}
		} else {
			System.out.println("Username doesn't match");
		}
	}

	public static void main(String[] args) {
		login();
	}

}
