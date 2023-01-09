package Challenge;

import java.util.ArrayList;
import java.util.List;

public class oddAndEven {

	public static void main(String[] args) {
		//array inputs
		int numbers[] = {1,2,3,4,5,6,7,8,9,10};
		
		//list to store the numbers
		List<Integer> evenNumbers = new ArrayList<>();
		List<Integer> oddNumbers = new ArrayList<>();
		
		//Iterate through the array and the numbers to the appropriate list
		for(int number : numbers)
		{
			if(number % 2 == 0)
			{
				evenNumbers.add(number);
			}else
			{
				oddNumbers.add(number);
			}
		}
		System.out.println("even Numbers = " + evenNumbers);
		System.out.println("Odd Numbers = " + oddNumbers);
		
		
	}
}
