package Arrays;
public class SelectionSort {
	//A selection sort algorithm sorts an unordered array list into an ordered array list
	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[index]) {
					index = j; //searching for lowest index
				}
			} //end loop
				int smallerNumber = arr[index];
				arr[index] = arr[i];
				arr[i] = smallerNumber;
			
			} //end loop
		} //end selectionSort()
		
//................................................
	
	public static void main(String[] a) {
		int[] arr1 = {8387, 2920, 4112, 8045, 6214, 5836, 6042, 6884, 4479}; //Unordered array of integers
		System.out.println("Before selection sort");
		for(int i: arr1) { //for-each integer in arr1
			System.out.print(i+" ");
		}
		System.out.println();
		
		selectionSort(arr1); //sort array with selection sort
		
		System.out.println("After Selection Sort");
		for(int i:arr1) {
			System.out.print(i+" ");
		}
	} //end main()
	
} //end SelectionSort
