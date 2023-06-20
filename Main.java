package com.company;

import java.util.Scanner;

import java .util.Random;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("Welcome to Rock, Paper and Scissor game.");

        System.out.println("Here Rock is indicated by 0"+
                " while paper is indicated by 1"+
                " and Scissor is represented by 2.");
        int user;
        int computer;
        int u1 = 0;
        int c1 = 0;
        for(int i=0; i<5; i++) {
            System.out.println("Enter your number");
            user = sc.nextInt();
            if (user == 0) {
                System.out.println("You have chosen Rock");
            } else if (user == 1) {
                System.out.println("You have chosen Paper");
            } else if (user == 2) {
                System.out.println("You have chosen Scissor");
            } else {
                System.out.println("You have entered invalid number");
            }
            System.out.println("Computer's turn to enter the value");
            computer = ran.nextInt(3);
            if (computer == 0) {
                System.out.println("Computer has chosen Rock");
            } else if (computer == 1) {
                System.out.println("Computer has chosen Paper");
            } else if (computer == 2) {
                System.out.println("Computer has chosen Scissor");
            }

            if (user == 0 && computer == 2 ||
                    user == 1 && computer == 0 ||
                    user == 2 && computer == 1) {
                System.out.println("You have won the round");
                u1++;
            }
            else if (user == 0 && computer == 0 ||
                    user == 1 && computer == 1 ||
                    user == 2 && computer == 2) {
            System.out.println("Round is drwan");
        }
            else if (user>2){
                System.out.println("Invalid value is entered");
            }
            else{
                System.out.println("computer has won the round");
                c1++;
            }
        }
            System.out.printf("\nYou have won %d matches.\nComputer has won %d matches.",u1,c1);
            System.out.println();
            if(u1>c1){
                System.out.println("You have won the match");
            }
            else if (u1<c1){
                System.out.println("You have lost the match");
            }
            else if(u1==c1){
                System.out.println("THe match is tied");
            }

    }
}
