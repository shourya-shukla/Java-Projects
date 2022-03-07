package com.Shourya;

import java.util.Scanner;

public class Main

{

    public static void main (String[] args) {

        System.out.println("Program to print star pattern.\n");

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows: ");

        int r = scan.nextInt();

        System.out.print("Press 1 for upward and 2 for downward: ");

        int sd = scan.nextInt();

        scan.close();

        String b = "";

        switch(sd) {

            case(1):

                for (int i = 1; i <= r; i++){

                    b = b + "*";

                    System.out.println(b);

                }

                break;

            case(2):

                for (int i = 1; i <= r; i++){

                    b = b + "*";

                }

                while (r > 0) {

                    System.out.println(b);

                    b = b.substring(0, b.length() - 1);

                    r--;

                }

                break;

            default:

                System.out.println("Invalid input, please try again.");

                break;

        }

    }

}
