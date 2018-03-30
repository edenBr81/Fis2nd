package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String yes = "";
        String no = "";
        Scanner scan = new Scanner(System.in);
        boolean redEyes;
        String result;
        System.out.print("Are your Eyes Red ? ");
        StringBuilder output=new StringBuilder();

        yes = scan.nextLine();

        if (yes.equalsIgnoreCase("yes")) {
            System.out.println("Get some sleep!");

        } else {
            System.out.println("You look great!");
        }

    }
}
