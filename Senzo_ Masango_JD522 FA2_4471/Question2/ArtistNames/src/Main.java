//package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {




        // create a 2d array
        Scanner in= new Scanner(System.in);
        //Artist Array
        int [][] artists={{900000,800000,500000},//Ed Sheeran
                          {700000,500000,500000},//Pink
                          {800000,100000,50000},//Bruno Mars
                          {100000,200000,200000},//Foo Fighters
                          {800000,100000,50000},//Taylor Swift
        };
           //int values
        String[] names= new String[5];
        names[1]="Ed Sheeran";
        names[2]="Pink";
        names[3]="Bruno Mars";
        names[4]="Foo Fighters";
        names[5]="Taylor Swift";

        System.out.println(names[1]);
        ArrayList ArtistNames = new ArrayList();
       ArtistNames.add("Ed Sheeran");



        System.out.println("Enter a number between 1 and 5");
        int artist = in.nextInt();
        //(artist>1 && artist<5)

        {
            System.out.println("Ed Sheeran");
            System.out.println("CD Sales:900000");
            System.out.println("DVD Sales:800000");
            System.out.println("Blue Ray Sales:500000");

            int num1 = 900000, num2 = 800000, num3 =500000, sum;
            sum = num1 + num2 + num3;

            System.out.println("Total Sales: "+sum);
            int Sales = in.nextInt();
            int TotalSales= artists[artist-1][artist];




        }

        System.out.println("Enter a number between 1 and 5");
       // int artist = in.nextInt();
        while(artist>2 && artist<5)

        {
            System.out.println("Pink");
            System.out.println("CD Sales:700000");
            System.out.println("DVD Sales:500000");
            System.out.println("Blue Ray Sales:500000");

            int num1 = 700000, num2 = 500000, num3 =500000, sum;
            sum = num1 + num2 + num3;

            System.out.println("Total Sales: "+sum);


            int Sales = in.nextInt();
            int TotalSales= artists[artist-1][artist];




        }

        System.out.println("Enter a number between 1 and 5");
        // int artist = in.nextInt();
        while(artist>3&& artist<5)

        {
            System.out.println("Bruno Mars");
            System.out.println("CD Sales:800000");
            System.out.println("DVD Sales:100000");
            System.out.println("Blue Ray Sales:50000");

            int num1 = 800000, num2 = 100000, num3 =50000, sum;
            sum = num1 + num2 + num3;

            System.out.println("Total Sales: "+sum);


            int Sales = in.nextInt();
            int TotalSales= artists[artist-1][artist];




        }

        System.out.println("Enter a number between 1 and 5");
        // int artist = in.nextInt();
        while(artist>4&& artist<5)

        {
            System.out.println("Foo Fighters");
            System.out.println("CD Sales:100000");
            System.out.println("DVD Sales:200000");
            System.out.println("Blue Ray Sales:200000");

            int num1 = 800000, num2 = 100000, num3 =50000, sum;
            sum = num1 + num2 + num3;

            System.out.println("Total Sales: "+sum);


            int Sales = in.nextInt();
            int TotalSales= artists[artist-1][artist];




        }

        System.out.println("Enter a number between 1 and 5");
        // int artist = in.nextInt();
        while(artist>5&& artist<5)

        {
            System.out.println("Foo Fighters");
            System.out.println("CD Sales:100000");
            System.out.println("DVD Sales:200000");
            System.out.println("Blue Ray Sales:200000");

            int num1 = 800000, num2 = 100000, num3 =50000, sum;
            sum = num1 + num2 + num3;

            System.out.println("Total Sales: "+sum);


            int Sales = in.nextInt();
            int TotalSales= artists[artist-1][artist];




        }
    }
}

