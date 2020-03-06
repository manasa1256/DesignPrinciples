package com.svecw.Serialization;
import java.util.*;
public class Calculator {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		double firstNumber = sc.nextDouble();
		System.out.println("Enter 2nd number");
		double secondNumber = sc.nextDouble();
		System.out.println("1:Addition");
		System.out.println("2:Subtraction");
		System.out.println("3:Multiplication");
		System.out.println("4:Division");
		System.out.println("Enter choice:");
		int choice = sc.nextInt();
		Calculatevalue ob = new Calculatevalue();
		switch(choice){
		case 1:ob.addition(firstNumber,secondNumber);
			   break;
		case 2:ob.subtraction(firstNumber,secondNumber);
				break;
		case 3:ob.multiplication(firstNumber,secondNumber);
				break;
		case 4:ob.division(firstNumber,secondNumber);
				break;
		default:System.out.println("Invalid choice");
		}
	}

}
