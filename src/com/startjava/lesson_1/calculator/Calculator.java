package com.startjava.lesson_1.calculator;

public class Calculator {
	public static void main(String[] args) {
		float firstNum = 8;
		float secondNum = 3;
		float result = 0;
		char operation = '^';

		if(operation == '+') {
			result = firstNum + secondNum;
		} else if(operation == '-') {
			result = firstNum - secondNum;
		} else if(operation == '/') {
			if(secondNum != 0) {
				result = firstNum / secondNum;
			} else {
				System.out.println("You can't divide by zero!");
			}
		} else if(operation == '*') {
			result = firstNum * secondNum;
		} else if(operation == '%') {
			if(secondNum != 0) {
				result = firstNum % secondNum;
			} else {
				System.out.println("You can't divide by zero!");
			}
		} else if(operation == '^') {
			result = 1;
			for(int i = 0; i < secondNum; i++) {
				result = result * firstNum;
			}
		}
		System.out.println("result: " + result);
	}
}