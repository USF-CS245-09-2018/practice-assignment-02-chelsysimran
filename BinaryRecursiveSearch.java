public class BinaryRecursiveSearch implements Practice2Search
{
	

	public int search(int [] arr, int target)
	{
		return binSearch(arr, target, 0, arr.length);
	}


	public int binSearch(int [] arr, int lower, int upper, int target)
	{

		if (upper>=lower) 
	        
	        { 
	            int middle = (lower + upper)/2; 

	            if (arr[middle] == target)
	            {
	                return middle; 
	            } 
	               

	            else if (arr[middle] > target)
	            {
	               return binSearch(arr, lower, middle-1, target);
	            } 

	            else 
	            {
	                return binSearch(arr, middle+1, upper, target); 
	            }
	        } 

	        return -1;
	}

	public String searchName()
	{
		return "Binary Recursive Search";
	}
}