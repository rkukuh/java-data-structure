package com.rkukuh.DataStructure.ch03_Sort;

class QuickSort
{
    public static void main(String[] args)
    {
        int[] numbers = {20, 35, -15, 7, 55, 1, -22};

        quickSort(numbers, 0, numbers.length);

        for (int number : numbers) {
            System.out.println(number);
        }
    }

    private static void quickSort(int[] input, int start, int end)
    {
        if (end - start < 2) return;

        int pivotIndex = partition(input, start, end);

        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    private static int partition(int[] input, int start, int end)
    {
        int j = end;
        int i = start;
        int pivot = input[start];

        while (i < j) {

            //noinspection StatementWithEmptyBody
            while (i < j && input[--j] >= pivot);

            if (i < j) input[i] = input[j];

            //noinspection StatementWithEmptyBody
            while (i < j && input[++i] <= pivot);

            if (i < j) input[j] = input[i];
        }

        input[j] = pivot;

        return j;
    }
}
