package Challenge;

import java.util.Arrays;

public class SortingNegativeToPositive {
	public static void main(String[] args) {
		int[] numbers = {-5, 3, 0, -2, 1, 2,45,88,45,32};

	    Arrays.sort(numbers);

	    for (int number : numbers) {
	      System.out.print(","+number);
	    }
	  }
	}


