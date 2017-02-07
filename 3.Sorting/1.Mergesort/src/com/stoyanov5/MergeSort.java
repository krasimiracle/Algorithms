package com.stoyanov5;

/**
 * Created by Krasimir Stoyanov on 07-Feb-17.
 */
public class MergeSort {

    private int[] array;
    private int[] tempArray;
    private int length;

    public void sort(int[] input) {
        this.array = input;
        length = input.length;
        this.tempArray = new int[length];
        mergeSort(0, length - 1);
    }

    private void mergeSort(int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            // Sort the left side
            mergeSort(low, middle);
            // Sort the right side
            mergeSort(middle + 1, high);
            // Combine them
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {

        System.arraycopy(array, low, tempArray, low, high + 1 - low);

        int i = low;
        int j = middle + 1;
        int k = low;

        while (i <= middle && j <= high) {
            if (tempArray[i] <= tempArray[j]) {
                array[k] = tempArray[i];
                i++;
            } else {
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }

        while (i <= middle) {
            array[k] = tempArray[i];
            k++;
            i++;
        }
    }
}
