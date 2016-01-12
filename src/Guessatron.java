/***********************************************************
 // Assignment :  Guessatron
 // by: Kyle Gray
 // Date: 1 / 11 / 2015
 // Description: Guesses your number between 1 - 100
 //  Notes: any special things you want me to consider.
 //***********************************************************
 //************************************************************
 If there are any questions that need to be answered put them here as comments
 */

import java.util.Scanner;

public class Guessatron
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        String userInput;
        int userMin = 1;
        int userMax = 100;
        int guess = 50;
        boolean complete = false;

        String intro = "Welcome to “GuessaTron” the smartest computer program in the world.\n Just to show you how smart I am, I am going to guess the number you chose as long as it is between 1 and 100.\n\nYou will think I am reading your mind";
        String options =
                "Y for correct number\n" +
                "L for lower\n" +
                "H for higher\n" +
                "Q for quit!\n";

        System.out.println(intro);
        while(!complete){
            System.out.println("Is your number " + guess + "?");
            System.out.println(options);
            userInput = input.next();
            switch (userInput)
            {
                case "Q":
                case "Y": System.out.println("Thanks for playing!");
                    complete = true;
                    break;
                case "L": userMax = guess;
                    break;
                case "H": userMin = guess;
                    break;

            }
            guess = ((userMax - userMin) / 2) + userMin;
        }
    }
}

///////////////////////////////////////////////////////////////////
///   End Of File
///////////////////////////////////////////////////////////////////