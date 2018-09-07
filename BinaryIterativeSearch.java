public class BinaryIterativeSearch implements Practice2Search
{
	public int search(int [] arr, int target)
	{
		int lower = 0; 
        int upper = arr.length - 1; 
        
        while (lower <= upper) 
        { 
            int middle = (lower + upper)/2; 
  
            if (arr[middle] == target) 
                return middle; 

            if (arr[middle] < target) 
                lower = middle + 1; 
 
            else
                upper = middle - 1; 
        } 

        return -1; 

	}

	public String searchName()
	{
		
		return "Binary Iterative Search";
	}
}