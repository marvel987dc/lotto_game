package lottopac;


import java.util.Random;


public class Lotto {
	//declaring an array to store three random numbers
	int[] numbers = new int[3];
	Random random = new Random();
	
	public Lotto() {
		//for loop to iterate through the numbers array 
		//and populate numbers with the random values from 1 to 9
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(9) + 1;
		}
	}
	// return the array numbers
	public int[] getNumbers() {
		return numbers;
	}
	
}