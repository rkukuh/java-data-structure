package com.rkukuh.datastructure.section02;

public class BasicArray
{
    public static void main(String[] args)
    {
        int[] numbers = new int[7];

        numbers[0] = 20;
        numbers[1] = 35;
        numbers[2] = -15;
        numbers[3] = 7;
        numbers[4] = 55;
        numbers[5] = 1;
        numbers[6] = -22;

        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i]);
        }
    }
}
