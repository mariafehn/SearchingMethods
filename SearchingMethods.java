package osu.cse2123;
/**
 * A collection of methods to search for elements on lists
 * 
 * @name YOUR NAME HERE
 * @version DATE HERE
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchingMethods {
	
	/**
	 * Performs linear search to find the index of an element, or -1 if
	 * the element is not in the list.
	 * 
	 * @param str String to look for
	 * @param list List to search
	 * @postcond prints the count of the number of steps taken to the screen
	 * @return -1 if str is not in list, or the index of the first occurrence of
	 *         str if it is in the list.
	 */
	public static int linearSearch(String str, List<String> list) {
		//TODO: Your code here.  NOTE: You MUST implement linear search, do
		// not try to use indexOf
		
		//TODO: Replace the line below with your own code
		return 0;
	}	
	
	/**
	 * Performs binary search to find the index of an element, or -1 if
	 * the element is not in the list.
	 * 
	 * @param str String to look for
	 * @param list List to search
	 * @precond list is in ascending sorted order (smallest to largest)
	 * @postcond prints the count of the number of steps taken to the screen
	 * @return -1 if str is not in list, or the index of any occurrence of
	 *         str if it is in the list.
	 */
	public static int binarySearch(String str, List<String> list) {
		//TODO: Your code here.  NOTE: You MUST implement linear search, do
		// not try to use indexOf
		
		//TODO: Replace the line below with your own code
		return 0;
	}
		

	public static void main(String[] args) {
		List<String> list = Arrays.asList("james","ran","to","the","market");
		System.out.println("Looking for to");
		int idx = linearSearch("to",list);
		System.out.println("to found at index "+idx);
		System.out.println();
		System.out.println("Looking for market");
		idx = linearSearch("market", list);
		System.out.println("market found at index "+idx);
		System.out.println();
		System.out.println("looking for monday");
		idx = linearSearch("monday",list);
		System.out.println("monday found at index "+idx);
	}

}
