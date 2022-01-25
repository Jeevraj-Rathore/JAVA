package com.company;
import java.util.Scanner;

public class cwh_19_cp4_ps {
    public static void main(String[] args) {
        /*
        int a = 10;
        if (a == 11){
            System.out.println("I am 11");
        }
        else{
            System.out.println("I am not 11");
        }
        */

        /*
        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in Physics");
        m1 = sc.nextByte();

        System.out.println("Enter your marks in Chemistry");
        m2 = sc.nextByte();

        System.out.println("Enter your marks in Maths");
        m3 = sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        System.out.println("Percentage is: " + avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulations, You have been promoted");
        }
        else{
            System.out.println("Sorry, You are not promoted");
        }
        */

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Income");
        float income = sc.nextFloat();
        float tax = 0;
        if(income<=2.5f){
            tax = tax + 0;
        }
        else if(income>2.5f && income<=5f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income>5f && income<=10f){
            tax = tax + 0.05f * (income - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if(income>10f){
            tax = tax + 0.05f * (income - 2.5f);
            tax = tax + 0.2f * (income - 5f);
            tax = tax + 0.3f * (income - 10f);
        }

        System.out.println("Total tax paid by the person is: " + tax);
        */
        /*

        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wedday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

        }
        */

        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if (website.endsWith(".org")) {
            System.out.println("This is an organisation website");
        } else if (website.endsWith(".com")) {
            System.out.println("This is an commercial website");
        } else if (website.endsWith(".in")) {
            System.out.println("This is an indian website");
        }
    }

}
