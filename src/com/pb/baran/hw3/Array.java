package com.pb.baran.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        int [] array = new int[10];                         //масив
        Scanner in = new Scanner(System.in);
        //заповнення масиву
        for(int i = 0;i < array.length; i++){
            System.out.println("Ведіть ціле число");
            int value = in.nextInt();
            array[i] = value;
        }
        //виведення елементів масиву

        System.out.println(Arrays.toString(array));
        /*
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        */
        //сумування елементів масиву
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сума елнментів масиву: " + sum);

        //визначення кількість пзитивних елементів масиву
        int pos = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >0 ){
                pos++;
            }
        }
        System.out.println("В масиві " + pos + " позитивних елементів");


    }
}
