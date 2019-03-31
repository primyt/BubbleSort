"""
@author Mrinal Pandey
  @date: 31st March, 2019
  @day_time Sunday 16:36
"""

def displayData(a, n):
    #Loop to print data
    for i in range(n):
        print (a[i], end = '\t')
    print() #To change line

#Sub-routine to sort elements in the array using Bubble Sort
def bubbleSort(a, n):
    #Outer loop
    for i in range(n - 1):
        #Inner loop
        for j in range(n - 1 - i):
            #Compare adjacent elements
            if a[j] > a[j + 1]:
                a[j], a[j + 1] = a[j + 1], a[j] #Swap if first is greater than the second

#Driver code to test above code
a = [8, 6, 9, 4, 2] #Array of elements
print ("\nArray before sorting:")
n = len(a) #Calculate length of array
displayData(a, n) #To Display data
bubbleSort(a, n) #To sort the data
print ("\nArray after sorting")
displayData(a, n) #To Display data
print() #To change line
