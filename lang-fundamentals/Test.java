package com.infosys.user;

import java.util.Scanner;
public class Test {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println(" Please enter value ");
		int a = sc.nextInt();
		System.out.println(" You have entered value is "+a);
		System.out.println("Following is Argument passed to Programs ");
		
		for (String s : args){

			System.out.println(s);
		}
	}
}
