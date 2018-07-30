package com.rkukuh.DataStructure.ch08_Search;

class LinearSearch
{
    public static void main(String[] args)
    {
        int[] numbers = {20, 35, -15, 7, 55, 1, -22};

        System.out.println(linearSearch(numbers, -15));
        System.out.println(linearSearch(numbers, 1));
        System.out.println(linearSearch(numbers, 8888));
        System.out.println(linearSearch(numbers, -22));
    }

    private static int linearSearch(int[] input, int value)
    {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == value) return i;
        }

        return -1;
    }
}
