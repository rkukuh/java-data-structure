package com.rkukuh.DataStructure.ch03_Sort;

class BubbleSort
{
    public static void main(String[] args)
    {
        int[] numbers = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = numbers.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            for (int i = 0; i < lastUnsortedIndex; i++) {

                if (numbers[i] > numbers[i + 1]) {

                    swap(numbers, i, i + 1);
                }
            }
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
