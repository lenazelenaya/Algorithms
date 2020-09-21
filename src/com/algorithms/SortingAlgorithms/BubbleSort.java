package com.algorithms.SortingAlgorithms;

public class BubbleSort {
    public int[] sort(int[] array) {
        boolean swapped;
        do{
            swapped = false;
            for (int i = 1; i < array.length; i++) {
                if(array[i-1] > array[i]){
                    swap(array, i-1, i);
                    swapped = true;
                }
            }
        }while (swapped);
        return array;
    }

    private void swap(int[] array, int left, int right){
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
