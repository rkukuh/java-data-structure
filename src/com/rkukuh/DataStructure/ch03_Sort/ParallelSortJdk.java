package com.rkukuh.DataStructure.ch03_Sort;

import java.util.Arrays;

class ParallelSortJdk
{
    public static void main(String[] args)
    {
        int[] numbers = {20, 35, -15, 7, 55, 1, -22};

        Arrays.parallelSort(numbers);

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
