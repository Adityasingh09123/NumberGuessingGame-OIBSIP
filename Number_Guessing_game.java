package com.company;

import javax.swing.*;

public class Number_Guessing_game{

    public static void main(String[] args) {
        int round=0;
        int computerNumber=0;
        
        int userAnswer = 0;
        int userScore=0;
        int computerScore=0;

        JOptionPane.showMessageDialog(null, "Let's Start the Guessing Game ");
        JOptionPane.showMessageDialog(null, "======================*****INSTRUCTIONS*****======================\n" +
                "1 - It is a five Round Number Guessing Game.\n" +
                "2 - User have to Guess the Number between 1 to 100 (Including 1 & 100).\n" +
                "3 - If the user guessing number is greater than computer then User get 1 point.\n" +
                "4 - If the user guessing number is lesser than computer then Computer get 1 point.\n" +
                "5 - If the user guessing number is same as computer then both members get 1 point.\n" +
                "6 - Those who get more points in the game they win the game.");

        // ==== Start The Game ====

        System.out.println("======= START THE GAME ========");

        // ==== This Loop Run the 5 Round of Guessing Game ======

        while(round!=5){
            System.out.println("**************************************************");
            round++;
            System.out.println("Round: "+round);
            computerNumber = (int) (Math.random()*100 + 1);
            System.out.println("Computer Generated Number is : " + computerNumber);
            String response = JOptionPane.showInputDialog(null,
                            "Round: "+round+"\n" +
                            "Guess the Number:", "Number Guessing Game", 3);

            userAnswer = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, "User Guessing Number is : "+userAnswer);
            System.out.println("User Guessing Number is : " + userAnswer);


            // ==== Show the Result of Each Round Of The Game ====

            if(userAnswer>computerNumber){
                JOptionPane.showMessageDialog(null, "User Guessing Number is Greater Than Computer By : "+(userAnswer-computerNumber));
            }
            else if(userAnswer==computerNumber){
                JOptionPane.showMessageDialog(null, "User Guessing Number is Same as Computer Number");
            }
            if(computerNumber>userAnswer){
                JOptionPane.showMessageDialog(null, "User Guessing Number is Lesser Than Computer By : "+(computerNumber-userAnswer));
            }

            // ==== Score Calculation Of Both The Team Member ======

            if (userAnswer < computerNumber ) {
                computerScore++;
            }
            else if (userAnswer == computerNumber ){
                userScore++;
                computerScore++;
            }
            else if (userAnswer>computerNumber){
                userScore++;
            }
            System.out.println("Computer Score is: " + computerScore);
            System.out.println("User Score is: "+userScore);

        }

        // ==== Result Of The Game ====

        System.out.println("====== FINAL SCORE AFTER 5 ROUND IS=========");
        if(userScore>computerScore){
            System.out.println("User win the game!");
            JOptionPane.showMessageDialog(null, "User win the Game By: "+userScore+"-"+computerScore);
        }
        else if(userScore==computerScore){
            System.out.println("Match Tied!");
            JOptionPane.showMessageDialog(null, "Match Tied!");
        }
        else{
            System.out.println("Computer win the game!");
            JOptionPane.showMessageDialog(null, "Computer Win the Game By: "+computerScore+"-"+userScore);
        }
    }
}

