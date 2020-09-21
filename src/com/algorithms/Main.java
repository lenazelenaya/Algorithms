package com.algorithms;

import com.algorithms.SortingAlgorithms.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();
        SelectionSort selectionSort = new SelectionSort();
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();

        int[] array = {1, 7, 2, 5, 4, 4, 6, 10, 2, 0, 11};

        // Arrays.stream(bubbleSort.sort(array)).forEach(System.out::println);
        // Arrays.stream(insertionSort.sort(array)).forEach(System.out::println);
        // Arrays.stream(selectionSort.sort(array)).forEach(System.out::println);
        // Arrays.stream(mergeSort.sort(array)).forEach(System.out::println);
        Arrays.stream(quickSort.sort(array)).forEach(System.out::println);

    }
}
