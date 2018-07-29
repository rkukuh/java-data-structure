package com.rkukuh.datastructure.ch03_Sort;

class SelectionSort
{
    public static void main(String[] args)
    {
        int[] numbers = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = numbers.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {

                if (numbers[i] > numbers[largest]) {

                    largest = i;
                }
            }

            swap(numbers, largest, lastUnsortedIndex);
        }


        for (int number : numbers) {

            System.out.println(number);
        }
    }

    private static void swap(int[] array, int i, int j)
    {
        if (i == j) return;

        int temp = array[i];

        array[i] = array[j];
        array[j] = temp;
    }
}
