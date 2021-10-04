package com.bridgelab;

	public class PrintArray<E> {
	    E[] myArray;

	    public PrintArray(E[] myArray) {
	        this.myArray = myArray;
	    }

	    public static void main(String[] args) {
	        Integer[] a = {1,2,3};
	        Double[] b = {1.1,2.2,3.3};
	        Character[] c = {'a','b','c'};

	        new PrintArray<Integer>(a).toPrint();
	        new PrintArray<Double>(b).toPrint();
	        new PrintArray<Character>(c).toPrint();
	    }

	    private void toPrint() {
	        toPrint(myArray);
	    }

	    private static<E> void toPrint(E[] a) {
	        for(E i:a)
	        {
	            System.out.println(i);
	        }
	    }

	}


