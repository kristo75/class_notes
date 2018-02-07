package com.example.user.rockpaperscissors;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by user on 24/01/2018.
 */

public class RockPaperScissors {

    private ArrayList<String> answer;

    public RockPaperScissors() {
        this.answer = new ArrayList<>();
        this.answer.add("Rock");
        this.answer.add("Paper");
        this.answer.add("Scissors");
    }

    public ArrayList<String> getList() {
        return this.answer;
    }

    public String getRandomAnswer() {
        Collections.shuffle(getList());
        return getList().get(0);
    }


    public String checkWin(String playerAnswer, String computerAnswer) {
        if (playerAnswer == "Rock" && computerAnswer == "Scissors") {
            return "player wins!";
        } else if (playerAnswer == "Rock" && computerAnswer == "Paper") {
            return "computer wins!";
        } else if (playerAnswer == "Paper" && computerAnswer == "Scissors") {
            return "computer wins!";
        } else if (playerAnswer == "Paper" && computerAnswer == "Rock") {
            return "player wins!";
        } else if (playerAnswer == "Scissors" && computerAnswer == "Rock") {
            return "computer wins!";
        } else if (playerAnswer == "Scissors" && computerAnswer == "Paper") {
            return "player wins!";
        } else {
            return "it's a draw, play again!";
        }
    }
}

