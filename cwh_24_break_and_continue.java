package com.company;

public class cwh_24_break_and_continue {
    public static void main(String[] args) {
        //breaks and continue using loops
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//            System.out.println("Java is amazing");
//            if (i == 2){
//                System.out.println("Ending the loop");
//                break;
//            }
//        }
//        int = 0;
//        while (i<5){
//            System.out.println(i);
//            System.out.println("Java is amazing");
//            if (i == 2){
//                System.out.println("Ending the loop");
//                break;
//            }
//            i++;
//        }

        //Continue Statement
//        for (int i = 0; i < 5; i++) {
//            if (i == 2){
//                System.out.println("Ending the loop");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("Java is amazing");
//        }

        int i=0;
        do{
            i++;
            if(i==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");

        }while(i<5);
        System.out.println("Loop ends here");


    }
}