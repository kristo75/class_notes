package com.example.user.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class RPSMainActivity extends AppCompatActivity {

    Button rockButton;
    Button paperButton;
    Button scissorsButton;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpsmain);
        rockButton = findViewById(R.id.rock_button);
        paperButton = findViewById(R.id.paper_button);
        scissorsButton = findViewById(R.id.scissors_button);
        result = findViewById(R.id.result);
    }

    public void onChooseRockButtonClick(View button) {
        String playerAnswer = "Rock";
        Log.d(getClass().toString(), "Answer is:" + playerAnswer);

        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        String computerAnswer = rockPaperScissors.getRandomAnswer();
        String winner = rockPaperScissors.checkWin(playerAnswer, computerAnswer);
        String output = "Computer chose " + computerAnswer + " - " + winner;
        result.setText(output);

    }

    public void onChoosePaperButtonClick(View button) {
        String playerAnswer = "Paper";
        Log.d(getClass().toString(), "Answer is:" + playerAnswer);

        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        String computerAnswer = rockPaperScissors.getRandomAnswer();
        String winner = rockPaperScissors.checkWin(playerAnswer, computerAnswer);
        String output = "Computer chose " + computerAnswer + " - " + winner;
        result.setText(output);

    }

    public void onChooseScissorButtonClick(View button) {
        String playerAnswer = "Scissor";
        Log.d(getClass().toString(), "Answer is:" + playerAnswer);

        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        String computerAnswer = rockPaperScissors.getRandomAnswer();
        String winner = rockPaperScissors.checkWin(playerAnswer, computerAnswer);
        String output = "Computer chose " + computerAnswer + " - " + winner;
        result.setText(output);

    }
}
