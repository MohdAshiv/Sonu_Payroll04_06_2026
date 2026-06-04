package utilities;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class sortingNmes 
{
	
	public static boolean isSorted(List<String> listOfStrings) {
	    if (isEmpty(listOfStrings) || listOfStrings.size() == 1) {
	        return true;
	    }

	    Iterator<String> iter = listOfStrings.iterator();
	    String current, previous = iter.next();
	    while (iter.hasNext()) {
	        current = iter.next();
	        if (previous.compareTo(current) > 0) {
	            return false;
	        }
	        previous = current;
	    }
	    return true;
	}

	private static boolean isEmpty(List<String> listOfStrings) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
// Check if the array is sorted
public static boolean isSorted(String[] arr)
{
//  for (int i = 0; i < arr.length-1; i++)
//  {
//      if (arr[i].compareTo(arr[i+1]) > 0)
//          return false;
//  }
    String[] arrSorted = arr;
    Arrays.sort(arrSorted);
     
    print(Arrays.toString(arr));
    print(Arrays.toString(arrSorted));
    
    for (int i = 0; i < arr.length; i++)
    {
        if (!arr[i].equals(arrSorted[i]))
            return false;
    }
    return true;
}

private static void print(String string) {
	// TODO Auto-generated method stub
	
}

	
	

}
