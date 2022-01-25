package com.company;

public class cwh_17_logical {
    public static void main(String[] args) {
        System.out.println("For Logical AND");
        boolean a = true;
        boolean b = false;
        if (a && b) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }

        System.out.println("For Logical OR");
        boolean a1 = true;
        boolean b2 = false;
        if (a1 || b2) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }

        System.out.println("For Logical NOT");
        boolean a3 = true;
        boolean b3 = false;
        System.out.println("Not(a3) is ");
        System.out.println(!a3);
        System.out.println("Not(b3) is ");
        System.out.println(!b3);



    }

}
