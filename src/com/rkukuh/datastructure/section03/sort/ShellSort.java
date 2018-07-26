package com.rkukuh.datastructure.section03.sort;

class ShellSort
{
    public static void main(String[] args)
    {
        int[] numbers = { 20, 35, -15, 7, 55, 1, -22 };

        for (int gap = numbers.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < numbers.length; i++) {

                int newElement = numbers[i];

                int j = i;

                while (j >= gap && numbers[j - gap] > newElement) {

                    numbers[j] = numbers[j - gap];

                    j -= gap;
                }

                numbers[j] = newElement;
            }
        }

        for (int number : numbers) {

            System.out.println(number);
        }
    }
}
