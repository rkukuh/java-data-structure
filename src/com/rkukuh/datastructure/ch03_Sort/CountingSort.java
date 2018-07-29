package com.rkukuh.datastructure.ch03_Sort;

class CountingSort
{
    public static void main(String[] args)
    {
        int[] numbers = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        countingSort(numbers, 1, 10);

        for (int number : numbers) {

            System.out.println(number);
        }
    }

    @SuppressWarnings("SameParameterValue")
    private static void countingSort(int[] input, int min, int max)
    {
        int[] countArray = new int[(max - min) + 1];

        for (int anInput : input) {

            countArray[anInput - min]++;
        }

        int j = 0;

        for (int i = min; i <= max; i++) {

            while (countArray[i - min] > 0) {

                input[j++] = i;

                countArray[i - min]--;
            }
        }
    }
}
