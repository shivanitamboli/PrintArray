package com.bridgelab;

public class PrintArray {
	public static void main(String[] args) {
		Integer[] a = { 1, 2, 3 };
		Double[] b = { 1.1, 2.2, 3.3 };
		Character[] c = { 'a', 'b', 'c' };
		toPrint(a);
		toPrint(b);
		toPrint(c);
	}

	private static <E> void toPrint(E[] a) {
		for (E i : a) {
			System.out.println(i);
		}
	}

}
