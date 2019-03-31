public class BubbleSort{
/*@author Priti Chattopadhyay
  @date: 31th March, 2019
  @day_time Sunday 11:50
*/
	//Bubble sort in Java
	// Declaration of class BubbleSort
	public static void main(String args[]){
		//Initializing an array of 5 elements
		int a[] = {8, 6, 4, 9, 2};
		//To get the length of the array
		int n = a.length;
		//Creating an object of class BubbleSort to call routines or methods
		BubbleSort obj = new BubbleSort();
		System.out.println("\nArray before sorting:");
		//calling a routine to display elements of the array before sorting
		obj.displayArray(a, n);//In Java, we always pass a reference to an array
		//calling the routine to sort the elements using bubble sort algorithm
		obj.bubbleSort(a, n);
		System.out.println("\nArray after sorting");
		//calling a routine to display elements of the array after sorting
		obj.displayArray(a, n);
	}
	
	//Routine to sort the array using bubble sort algorithm
	//Sorting the elements in non-decreasing order
	void bubbleSort(int a[], int n){
		int temp;//a temporary variable used during swapping elements
		//Outer loop
		for(int i = 0; i < n - 1; i++){
			//Inner loop
			for(int j = 0; j < n - 1 - i; j++){
				//Comparing adjacent elements
				if(a[j] > a[j + 1]){
					//Swapping of elements present at a[j] and a[j+1]
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}//if ends
			}//Inner loop ends
		}//Outer loop ends
	}//Bubble sort routine ends

	//Routine to display elements of an array
	void displayArray(int a[], int n){
		for(int i = 0; i < n; i++){
			System.out.print(a[i] + "\t");
		}
		System.out.println("\n");
	}//end of display routine
}
