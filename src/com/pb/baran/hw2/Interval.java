package com.pb.baran.hw2;
import java.util.Scanner;
public class Interval {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("Введіть ціле число: ");
        a = input.nextInt();
        //[0 -14] [15 - 35] [36 - 50] [51 - 100]
        if (a >= 0 && a <= 14) {
            System.out.println("[0 -14]");
        } else if (a >= 15 && a <= 35){
            System.out.println("[15 -35]");
        }  else if (a >= 36 && a <= 50){
            System.out.println("[36 -50]");
        }  else if (a >= 51 && a <= 100) {
            System.out.println("[51 -100]");
        }

    }
}
