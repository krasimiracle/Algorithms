package com.stoyanov5;

public class MergesortDemo {

    public static void main(String[] args) {

        int[] numbers = new int[]{5, 4, 1, 2, 12, 8, 5, 6, 3};
        MergeSort mergeSort = new MergeSort();

        mergeSort.sort(numbers);

        for (Object item : numbers) {
            System.out.print(item + " ");
        }
    }
}
