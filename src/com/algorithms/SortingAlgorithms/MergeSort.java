package com.algorithms.SortingAlgorithms;

import java.util.Arrays;

public class MergeSort {
    public int[] sort(int[] array){
        int leftLength = array.length/2;
        int rightLength = array.length - leftLength;
        int[] leftPart = new int[leftLength];
        int[] rightPart = new int[rightLength];

        sort(leftPart);
        sort(rightPart);
        merge(array, leftPart, rightPart);

        return array;
    }

    private void merge(int[] array, int[] left, int[] right) {
        int leftIndex = 0;
        int rightIndex = 0;
        int targetIndex = 0;
        int remaining = left.length + right.length;
        while(remaining > 0)
        {
            if (leftIndex >= left.length)
            {
                array[targetIndex] = right[rightIndex++];
            }
            else if (rightIndex >= right.length)
            {
                array[targetIndex] = left[leftIndex++];
            }
            else if (left[leftIndex]< right[rightIndex])
            {
                array[targetIndex] = left[leftIndex++];
            }
            else
            {
                array[targetIndex] = right[rightIndex++];
            }

            targetIndex++;
            remaining--;
        }
    }
}
