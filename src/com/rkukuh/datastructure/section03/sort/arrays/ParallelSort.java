package com.rkukuh.datastructure.section03.sort.arrays;

import java.util.Arrays;

public class ParallelSort
{
    public static void main(String[] args)
    {
        int[] numbers = { 20, 35, -15, 7, 55, 1, -22 };

        Arrays.parallelSort(numbers);

        for (int number : numbers) {

            System.out.println(number);
        }
    }
}
