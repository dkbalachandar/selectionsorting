package com;

/**
 * A simple class to demonstrate the selection sorting algorithm
 */
public class SelectionSorting {

    public static void main(String[] args) {

        int[] intArray = {11, 2, 13, 4, 5, 7};
        SelectionSorting selectionSorting = new SelectionSorting();
        selectionSorting.printElements("Before Sorting", intArray);
        selectionSorting.doSorting(intArray);
        selectionSorting.printElements("After Sorting", intArray);
    }

    public void printElements(String message, int[] intArray) {
        System.out.println(message);
        for (Integer num : intArray) {
            System.out.println(num);
        }
    }

    /**
     * Sort the elements with Selection sort algorithm
     *
     * For each pass, the smallest element is selected and moved to the proper position[Ascending]
     * Worst, Best and Avg case complexity is O(n^2)
     *
     * @param intArray
     */
    public static void doSorting(int[] intArray) {

        int i, j;
        int minIndex;
        int temp;
        for (i = 0; i < intArray.length - 1; i++) {
            minIndex = i; //Min index is set as i
            for (j = i+1; j < intArray.length; j++) {
                if (intArray[minIndex] > intArray[j]) { // Compare the minIndex element with all the element                      // and change the minIndex
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                temp = intArray[minIndex];
                intArray[minIndex] = intArray[i];
                intArray[i] = temp;
            }
        }
    }
}
