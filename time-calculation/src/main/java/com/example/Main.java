package com.example;

import java.util.*;

public class Main {

     public static String calculateHours(Integer[] arr) {
     //CODE YOUR LOGIC HERE!!!!!
          Integer sumTime = 0;
          for (Integer element : arr) {
               sumTime += element;
          }
          if (sumTime <= 60) {
               String time = sumTime.toString();
               return time + " minutes";
          } else {
               double divHr = sumTime;
               double hrs = divHr/60;
               int hrsOnly = (int)divHr;
               double minsLeft = hrs - hrsOnly;
               double mins = minsLeft * 60;
               if (hrsOnly >= 2) {
                    return hrsOnly + " hours" + mins + " minutes";
               } else if (mins == 0 && hrsOnly == 1) {
                    return hrsOnly + " hour";
               } else if (mins == 0 && hrsOnly >= 2){
                    return hrsOnly + " hours";
               } else {
                    return hrsOnly + " hour" + mins + " minutes";
               }
          }
     }

     // DO NOT TOUCH THE CODE BELOW
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int size = sc.nextInt();
          Integer[] arr = new Integer[size];
          for (int i = 0; i < size; i++) {
               arr[i] = sc.nextInt();
          }
          sc.close();
          System.out.println(calculateHours(arr));
     }
}