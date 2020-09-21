package com.algorithms.SortingAlgorithms;

public class QuickSort {
    public int[] sort(int[] array) {
        quicksort(array, 0, array.length - 1);
        return array;
    }

    private void quicksort(int[] array, int left, int right) {
        if (left < right) {
            int index = partition(array, left, right);

            quicksort(array, left, index - 1);
            quicksort(array, index, right);
        }
    }

    private int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = (left - 1);

        for (int j = left; j < right; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, right);

        return i + 1;
    }

    private void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
