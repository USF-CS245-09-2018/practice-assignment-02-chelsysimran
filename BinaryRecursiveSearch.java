public class BinaryRecursiveSearch implements Practice2Search
{
	public int search(int [] arr, int lower, int upper, int target)
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
	               return search(arr, lower, middle-1, target);
	            } 

	            else 
	            {
	                return search(arr, middle+1, upper, target); 
	            }
	        } 

	        return -1;
	}

	public String searchName()
	{
		return "Binary Recursive Search";
	}
}