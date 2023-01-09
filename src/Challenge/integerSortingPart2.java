package Challenge;

import java.util.ArrayList;
import java.util.List;

public class integerSortingPart2 {

	public static void main(String[] args) {
		int arr[] = {3, -3, 45, 2, -19, -7, 56, 45};
		System.out.println("total number of elements = "+ arr.length );
	
	List<Integer> allNumber = new ArrayList<>();
	List<Integer> negativeNumber = new ArrayList<>();
	
	for(Integer data : arr)
	{
		if(data >= 0) {
			allNumber.add(data);
		}else
		{
			negativeNumber.add(data);
		}
	}
	
	allNumber.addAll(negativeNumber);
		System.out.println(allNumber);
		
		
	}
}
