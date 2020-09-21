package com.algorithms;

import com.algorithms.SortingAlgorithms.BubbleSort;
import com.algorithms.SortingAlgorithms.InsertionSort;
import com.algorithms.SortingAlgorithms.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();
        SelectionSort selectionSort = new SelectionSort();

        int[] array = {1, 7, 2, 5, 4, 4, 6, 10, 2, 0, 11};

        // Arrays.stream(bubbleSort.sort(array)).forEach(System.out::println);
        // Arrays.stream(insertionSort.sort(array)).forEach(System.out::println);
        Arrays.stream(selectionSort.sort(array)).forEach(System.out::println);

    }
}
