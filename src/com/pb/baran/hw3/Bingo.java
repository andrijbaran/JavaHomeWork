package com.pb.baran.hw3;


import java.util.Scanner;

public class Bingo {
    public static void main(String[] args){
        System.out.println("Вгадайте задумане число від 1 до 100");

        final int GUESS_NUM = 27;                   // загадане число
        int nAtt = 0;                               // кількість спроб
        Scanner in = new Scanner(System.in);

        int iNum;                                   // введене число
       do{
           nAtt++;
           System.out.println("Введіть своє число");
           iNum = in.nextInt();                     // введене число
           if(iNum == GUESS_NUM){
               System.out.println("Ура!!! Ви вгадали число з " + nAtt + " спроби");
               break;
           } else {
               if (iNum < GUESS_NUM){
                   System.out.println("Загадане число більше");
               } else {
                   System.out.println("Загадане число менше");
               }
           }
           System.out.println("Ви бажаєте продовжувати? Ведіть Y або N");
           String iExit = in.next();
           if (iExit.equals("N")){
               break;
           }

       }while ( iNum != GUESS_NUM);

    System.out.println("Кінець гри !");


    }
}
