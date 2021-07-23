package Recursion;
//Binary search of an Array structure using Recursion
public class RecursiveBinarySearch {
	public static int recursiveBinarySearch(int[] list, int key) {
		int low = 0; //first element, located @ index 0
		int high = list.length - 1; //last element, located @ last index (length-1)
		return recursiveBinarySearch(list, key, low, high);
	}
//................................................................

	private static int recursiveBinarySearch(int[] list, int key, int low, int high) {
		if (low > high) //Cannot find the key in the list
			return - low - 1;
		
		int mid = (low + high) / 2; //The middle element
		
		if (key < list[mid]) /*The key is somewhere in the first half of the array, eliminate the other half and run
		the algo again*/
			return recursiveBinarySearch(list, key, low, mid - 1); //recursive call
		
		else if (key == list[mid]) //The key is the middle element
			return mid;
		
		else
			return recursiveBinarySearch(list, key, mid + 1, high);
	} //end recursiveBinarySearch()
//.................................................................
}
