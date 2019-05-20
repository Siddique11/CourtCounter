package com.example.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
    }

    public void addThreeForTeamA(View view) {
        int threePoint = 3;
        scoreTeamA += threePoint;
        displayForTeamA(scoreTeamA);

    }

    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addTwoForTeamA(View view) {
        int twoPoint = 2;
        scoreTeamA += twoPoint;
        displayForTeamA(scoreTeamA);
    }

    public void addFreePointA(View view) {
        int freePoint = 1;
        scoreTeamA += freePoint;
        displayForTeamA(scoreTeamA);
    }


    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addFreePointB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoForTeamB(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void addThreeForTeamB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void subtractPointB(View view) {

        if(scoreTeamB > 0 ){
            scoreTeamB -= 1;
            displayForTeamB(scoreTeamB);
        }

    }

    public void subtractPointA(View view) {
        if(scoreTeamA > 0){
            scoreTeamA -= 1;
            displayForTeamA(scoreTeamA);
        }

    }
}
