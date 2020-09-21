package com.algorithms.SortingAlgorithms;

import java.awt.dnd.InvalidDnDOperationException;

public class InsertionSort {
    public int[] sort(int[] array){
        for (int i = 1; i < array.length; i++) {
            if(array[i-1] > array[i]){
                int indexToInsert = findIndexToInsert(array, array[i]);
                insert(array, i, indexToInsert);
            }
        }
        return array;
    }

    private void insert(int[] array, int indexToInsertFrom, int indexToInsertAt) {
        int temp = array[indexToInsertAt];

        array[indexToInsertAt] = array[indexToInsertFrom];

        if (indexToInsertFrom - indexToInsertAt >= 0)
            // source, source position, destination, destination position, length
            System.arraycopy(array, indexToInsertAt, array, indexToInsertAt + 1, indexToInsertFrom - indexToInsertAt);
        array[indexToInsertAt + 1] = temp;
    }

    private int findIndexToInsert(int[] array, int value) {
        for (int j = 0; j < array.length; j++) {
            if(array[j] > value){
                return j;
            }
        }
        throw new InvalidDnDOperationException("Index to insert was not found");
    }
}
