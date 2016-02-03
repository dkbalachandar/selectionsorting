package com;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by byk29 on 2/2/16.
 */
public class SelectionSortingTest {

    @Test
    public void testSort() {

        int[] intArray = {12, 2, 31, 46, 51, 71};
        SelectionSorting sorting = new SelectionSorting();
        sorting.printElements("Before Sorting", intArray);
        sorting.doSorting(intArray);
        sorting.printElements("After Sorting", intArray);
        assertEquals(2, intArray[0]);
    }


}
