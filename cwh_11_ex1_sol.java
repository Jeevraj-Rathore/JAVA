package com.company;
import java.util.Scanner;

public class cwh_11_ex1_sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Physics marks : ");
        int physics = sc.nextInt();
        System.out.println("Enter your Chemistry marks : ");
        int chemistry = sc.nextInt();
        System.out.println("Enter your Maths marks : ");
        int maths = sc.nextInt();
        System.out.println("Enter your English marks : ");
        int english = sc.nextInt();
        System.out.println("Enter your IP marks : ");
        int ip = sc.nextInt();

        float percentage = ((physics + chemistry + english + maths + ip)/500.0f)*100;
        System.out.println("Percentage : ");
        System.out.println(percentage);

    }

}
