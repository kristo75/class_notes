package com.example.allymcgilloway.eightball_start_code;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EightBallActivity extends AppCompatActivity {

    EditText questionEditText;
    Button shakeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight_ball);

        questionEditText = findViewById(R.id.question);
        shakeButton = findViewById(R.id.button);
    }

    public void onShakeButtonClicked(View button){
//        Log.d(getClass().toString(), "onshakeButtonClick was called");
        String question = questionEditText.getText().toString();
        Log.d(getClass().toString(), "The question asked was: " + question);
//        Answer answer = new Answer();
        EightBall  eightBall = new EightBall(new Answer());
        String answer = eightBall.randomAnswer();
        Intent intent = new Intent(this, AnswerActivity.class);
        intent.putExtra("answer", answer);
        startActivity(intent);
    }

}
