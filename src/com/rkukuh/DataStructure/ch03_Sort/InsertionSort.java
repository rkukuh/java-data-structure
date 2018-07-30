package com.rkukuh.DataStructure.ch03_Sort;

class InsertionSort
{
    public static void main(String[] args)
    {
        int[] numbers = {20, 35, -15, 7, 55, 1, -22};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < numbers.length; firstUnsortedIndex++) {

            int i;
            int newElement = numbers[firstUnsortedIndex];

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
