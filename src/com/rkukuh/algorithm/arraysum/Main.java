package com.rkukuh.algorithm.arraysum;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String arrayInline = scan.nextLine();

        String[] numbers = arrayInline.split(" ");

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            sum += Integer.parseInt(numbers[i]);
        }

        System.out.println(sum);
    }

}
