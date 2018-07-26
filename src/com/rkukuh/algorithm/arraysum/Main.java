package com.rkukuh.algorithm.arraysum;

import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String arrayInline = scan.nextLine();

        String[] numbers = arrayInline.split(" ");

        int sum = 0;

        for (String number : numbers) {

            sum += Integer.parseInt(number);
        }

        System.out.println(sum);
    }

}
