package com.company;

import java.util.Scanner;

public class factorial {
    public static int getFactorial(int f) {
        int result = 1;

        for(int i = 1; i <= f; ++i) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(getFactorial(n));
    }

}
