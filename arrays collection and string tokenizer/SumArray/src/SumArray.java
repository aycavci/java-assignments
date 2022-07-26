/*
 * File: SumArray.java
 * ----------------------
 * This program generates N random numbers in range(1-10) and store them in an array.
 * Then prints the sum of the array with random numbers.
 */

import acm.program.*;
import acm.util.*;

public class SumArray extends ConsoleProgram {

	public void run(){
		int length = readInt("Please enter array length: ");
		int max = readInt("Please enter largest number: ");
		int[] array = new int[length];
		fillArrayRandomly(array, max);
		printArray(array);
		println("Sum = " + sumArray(array));
	}


	//Initialize given array with random numbers in given numberRange
	private void fillArrayRandomly(int[] array, int max) {
		// Your code starts here

		// Your code ends here
	}


	//Sum all elements of given array return sum
	private int sumArray(int[] array) {
		int sum = 0;		
		// Your code starts here
		
		// Your code ends here
		return sum;
	}

	//Print the elements of the array
	void printArray(int[] array) {
		print("[ ");
		for (int i = 0; i < array.length; i++) {
			print(array[i] + " ");
		}
		println("]");
	}

	private RandomGenerator rgen = RandomGenerator.getInstance();
}
