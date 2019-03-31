/*@author Priti Chattopadhyay
  @date: 17th March, 2019
  @day_time Sunday 14:30
*/

using namespace std;
//Preprocessor directive
#include<iostream>

//Bubble Sort in C++
void bubbleSort(int*, int);
void display(int*, int);

int main()
{
	// Take an array of n integers 
	int a[5] = {8, 6, 4, 9, 2};
	cout<<"\nArray before Sorting:\n";
	//calling the routine to display elements in the array before sorting
	display(a, 5);
	//calling a routine to sort the elements
	bubbleSort(a, 5);
	return 0;
}

//Routine to sort the elements of the array
//Sorting in non - decreasing order
void bubbleSort(int *arr, int n)
{
	int i, j, temp;
	//Outer loop
	for(i = 0; i < n-1; i++)
	{
		//Inner loop
		for(j = 0; j < n-1-i; j++)
		{
			//Compare two adjacent elements
			if(arr[j] > arr[j + 1])
			{
				//swap a[j] and a[j+1] when true
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;		
			}//end if
		}//end Inner loop
	}//end Outer loop
	
	cout<<"\nArray after sorting:\n";
	//calling a routine to display the elements of the array after sort
	display(arr, n);
}

// Routine to display elements of an array 
void display(int *a, int n)
{
	int i;
	for(i = 0; i < n; i++)
	{
		cout<<a[i]<<"\t";
	}
	cout<<endl<<endl;
}
