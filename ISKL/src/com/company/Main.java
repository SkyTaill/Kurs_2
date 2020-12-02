package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);

        String[][] inArray = new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String[][] inArray2 = new String[][]{{"2", "2", "3", "4"}, {"1", "2", "fs", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        try {
            Sum(inArray);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
        try {
            Sum(inArray2);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

    }
   static public void Sum(String[][] inArray) throws MyArrayDataException {
       for(int i=0;i<inArray.length;i++) {
           if (inArray[i].length!=4||inArray.length!=4||inArray[i]==null) {
               throw new MyArraySizeException();
           }
       }
       int summ = 0;
       int value = 0;
       int row = 0;
       int cell = 0;
       for(int i2=0;i2<inArray.length;i2++) {
           row = i2;
           for(int i3=0;i3<inArray.length;i3++) {
               cell = i3;
               try{
                   value = Integer.parseInt(inArray[i2][i3]);
                   summ += value;
               } catch (IllegalArgumentException e){
                   String message = "в "+String.valueOf(row)+" ряду, "+String.valueOf(cell)+" ячейке";
                   throw new MyArrayDataException(message);
               }
           }

       }
       System.out.println(summ);
    }
}
