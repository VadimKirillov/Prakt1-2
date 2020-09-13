package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class PitomnikSobak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Dog[] pitomnik = new Dog[]{new Dog("Tuzik", 2), new Dog("Bim", 4), new Dog("Sharik", 9)};

        for(int i = 0; i < 3; ++i) {
            System.out.println(pitomnik[i].getName() + " " + pitomnik[i].getAge());
        }

        Dog billi = new Dog(n);
        Dog tom = new Dog();
        Dog jack = new Dog("Jack", 8);
        tom.setAge(3);
        System.out.println(billi.age);
        System.out.println(tom.age);
        System.out.println(jack.getAge());
        System.out.println(jack.getName());
    }

}
