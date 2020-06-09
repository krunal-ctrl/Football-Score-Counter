package com.example.android.courtcounter;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }

    /*
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /*
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /*
     * Displays the given foul for Team A & B.
     */
    public void displayFoulTeamA(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(foul));
    }

    public void displayFoulTeamB(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(foul));
    }

    /*
    * Button methods for team A
    */
    private int scoreTeamA = 0;
    private int foulTeamA = 0;
    public void plusThreeA(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void plusTwoA(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void freeKickA(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void foulA(View view) {
        displayFoulTeamA(--foulTeamA);
    }
    /*
    * button methods for team B
    */
    private int scoreTeamB = 0;
    private int foulTeamB = 0;
    public void plusThreeB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void plusTwoB(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void freeKickB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void foulB(View view) {
        displayFoulTeamB(--foulTeamB);
    }

    /*
    * reset button method
    */

    public void resetCourt(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulTeamA(foulTeamA);
        displayFoulTeamB(foulTeamB);
    }
}