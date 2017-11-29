package com.example.android.golfstableford;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void parm2a(View view) {
        scoreA = scoreA + 6;
        displayForPlayerA(scoreA);
    }
    public void parm1a(View view) {
        scoreA = scoreA + 5;
        displayForPlayerA(scoreA);
    }
    public void para(View view) {
        scoreA = scoreA + 4;
        displayForPlayerA(scoreA);
    }
    public void parp1a(View view) {
        scoreA = scoreA + 3;
        displayForPlayerA(scoreA);
    }
    public void parp2a(View view) {
        scoreA = scoreA + 2;
        displayForPlayerA(scoreA);
    }
    public void parp3a(View view) {
        scoreA = scoreA + 1;
        displayForPlayerA(scoreA);
    }
    public void parm2b(View view) {
        scoreB = scoreB + 6;
        displayForPlayerB(scoreB);
    }
    public void parm1b(View view) {
        scoreB = scoreB + 5;
        displayForPlayerB(scoreB);
    }
    public void parb(View view) {
        scoreB = scoreB + 4;
        displayForPlayerB(scoreB);
    }
    public void parp1b(View view) {
        scoreB = scoreB + 3;
        displayForPlayerB(scoreB);
    }
    public void parp2b(View view) {
        scoreB = scoreB + 2;
        displayForPlayerB(scoreB);
    }
    public void parp3b(View view) {
        scoreB = scoreB + 1;
        displayForPlayerB(scoreB);
    }
    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        displayForPlayerA(scoreA);
        displayForPlayerB(scoreB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForPlayerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForPlayerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_b_score);
        scoreView.setText(String.valueOf(score));
    }
}

