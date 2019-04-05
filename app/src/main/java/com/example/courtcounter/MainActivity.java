package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int gameScorea=0;
    int GameScoreb=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Team41(View view)
    {
        gameScorea=gameScorea+1;
        displayForTeamA(gameScorea);
    }
    public void paints(View view)
    {
        gameScorea=gameScorea-1;
     displayForTeamA(gameScorea);
    }
    public void Team42(View view)
    {
        GameScoreb=GameScoreb+1;
        displayForTeamB(GameScoreb);
    }
    public void xxx(View view)
    {
        GameScoreb=GameScoreb-1;
        displayForTeamB(GameScoreb);
    }

    public void clearit(View view)
    {
        gameScorea=0;
        GameScoreb=0;
        displayForTeamA(gameScorea);
        displayForTeamB(GameScoreb);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
