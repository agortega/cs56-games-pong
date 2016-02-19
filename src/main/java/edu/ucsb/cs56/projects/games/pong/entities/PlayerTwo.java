package edu.ucsb.cs56.projects.games.pong.entities;

/**
 * Created by angelortega on 2/18/16.
 */
public class PlayerTwo implements Player {
    private int ballsLost;
    private int goalsScored;
    private int highScore;

    public PlayerTwo() {

    }

    @Override
    public int getHighScore() {
        return 0;
    }

    @Override
    public int getBallsLost() {
        return 0;
    }

    @Override
    public int getGoalsScored() {
        return 0;
    }
}
