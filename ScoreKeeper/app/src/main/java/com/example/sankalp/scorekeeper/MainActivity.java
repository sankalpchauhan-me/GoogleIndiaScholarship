package com.example.sankalp.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void plusthreeA(View v){
        scoreTeamA = scoreTeamA+3;
        displayA(scoreTeamA);
    }
    public void plustwoA(View v){
        scoreTeamA = scoreTeamA+2;
        displayA(scoreTeamA);
    }
    public void plusoneA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayA(scoreTeamA);
    }
    //Team b
    public void plusthreeB(View v){
        scoreTeamB = scoreTeamB+3;
        displayB(scoreTeamB);
    }
    public void plustwoB(View v){
        scoreTeamB = scoreTeamB+2;
        displayB(scoreTeamB);
    }
    public void plusoneB(View v){
        scoreTeamB = scoreTeamB+1;
        displayB(scoreTeamB);
    }
    //Reset
    public void reset(View v){
        scoreTeamA=0;
        scoreTeamB=0;
        displayA(scoreTeamA);
        displayB(scoreTeamB);
    }
   public void displayA(int score){
        TextView scoreA = (TextView) findViewById(R.id.scoreA);
        scoreA.setText(String.valueOf(score));
   }
    public void displayB(int score){
        TextView scoreB = (TextView) findViewById(R.id.scoreB);
        scoreB.setText(String.valueOf(score));
    }
}
