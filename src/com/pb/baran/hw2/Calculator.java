package com.pb.baran.hw2;


import java.util.Scanner;

public class Calculator {
    public static void main (String[] args) {
        int operand1;
        int operand2;
        String sign;
        int result;

        Scanner input = new Scanner(System.in);

        System.out.println("Введіть число: ");
        operand1 = input.nextInt();
        System.out.println("Введіть тип операції: +-*/");
        sign = input.next();
        System.out.println("Введіть число: ");
        operand2 = input.nextInt();



        switch (sign) {
            case "+":
                result = operand1 + operand2;
                System.out.println(result);
                break;
            case "-":
                result = operand1 - operand2;
                System.out.println(result);
                break;
            case "*":
                result = operand1 * operand2;
                System.out.println(result);
                break;
            case "/":
                if (operand2 != 0) {
                    result = operand1 / operand2;
                    System.out.println(result);
                    break;
                } else {
                    System.out.println("На нуль ділити заборонено !");
                }
        }
    }
}
