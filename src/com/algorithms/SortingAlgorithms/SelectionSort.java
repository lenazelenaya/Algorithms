package com.algorithms.SortingAlgorithms;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SelectionSort {
    public int[] sort(int[] array){
        int sortedPartLastIndex = 0;
        while(sortedPartLastIndex < array.length){
            int nextIndex = findIndexOfSmallest(array, sortedPartLastIndex);
            swap(array, sortedPartLastIndex, nextIndex);

            sortedPartLastIndex++;
        }
        return array;
    }

    private int findIndexOfSmallest(int[] array, int index) {
        return IntStream.range(index, array.length)
                .reduce((i, j) -> array[i] > array[j] ? j : i)
                .getAsInt();
    }

    private void swap(int[] array, int left, int right){
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;

    }
}
