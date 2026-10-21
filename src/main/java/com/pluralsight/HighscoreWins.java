package com.pluralsight;

import java.util.Scanner;

public class HighscoreWins {
    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);

        // prompt the user to enter team names and final scores in specific format
        System.out.println("Please enter the teams and final score in the following format\n" +
                "Home:Visitor|21:9");
        String userInput = myscanner.nextLine();

        // takes userInput and breaks it into parts by the : and |, then places it into an array
        String[] linePieces = userInput.split("[:|]");
        // parse the string
        String team1 = linePieces[0], team2 = linePieces[1];
        int score1 = Integer.parseInt(linePieces[2]), score2 = Integer.parseInt(linePieces[3]);

        System.out.println(team1 + team2 + score1 + score2);
    }
}
