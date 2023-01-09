package Challenge;

public class integerSorting {
	
	public static void main(String[] args) {
		
		int arr[] = {3, -3, 45, 2, -19, -7, 56, 45};
		int n = arr.length;
		
		System.out.println("number length = "+ n);
		
		sortArray(arr,n);
		
		for(int i :arr) {
			System.out.print(i + " ");
		}
		
	}
	
	private static void sortArray(int[] arr, int n)
	{
		int tempAll[] = new int[n];
		int j = 0;
		
		//for loops for positive number
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i]>=0) 
			{
				tempAll[j++]= arr[i];
			}
		}
		
		if(j==n || j==0)
		{
			return; 
			
		}
		
		//for loop for collect -ve numbers
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i]<0) 
			{
				tempAll[j++]= arr[i];
			}
		}
		
		for(int i = 0; i < tempAll.length; i++)
		{
			arr[i] = tempAll[i];
		}
	}

}
