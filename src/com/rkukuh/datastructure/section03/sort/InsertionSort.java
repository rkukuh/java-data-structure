package com.rkukuh.datastructure.section03.sort;

public class InsertionSort
{
    public static void main(String[] args)
    {
        int[] numbers = { 20, 35, -15, 7, 55, 1, -22 };

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < numbers.length; firstUnsortedIndex++) {

            int newElement = numbers[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && numbers[i - 1] > newElement; i--) {

                numbers[i] = numbers[i - 1];
            }

            numbers[i] = newElement;
        }

        for (int number : numbers) {

            System.out.println(number);
        }
    }
}
