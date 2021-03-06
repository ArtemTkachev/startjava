package com.startjava.lesson_1.cycle;

public class Cycle {
	public static void main(String[] args) {
		for(int i = 0; i <= 20; i++) {
			System.out.println(i);
		}

		int y = 6;
		while(y >= -6) {
			System.out.println(y);
			y -= 2;
		}

		int z = 10;
		int res = 0;
		do {
			if(z % 2 != 0) {
				res += z;
			}
			z++;
		} while(z <= 20);

		System.out.println(res);
	}
}