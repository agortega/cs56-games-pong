package edu.ucsb.cs56.projects.games.pong.window;

import javax.swing.*;

/**
 * Created by angelortega on 2/18/16.
 */
public class Window {

    private static String TITLE = "Main Menu";
    private static String INSTRUCTIONS = "Instructions";
    private static String PLAY = "Play";
    private static String HIGHSCORES = "HIGHSCORES";
    private JFrame frame;

    public Window() {

        JFrameBuilder builder = new JFrameBuilder();
        builder.addTitle(TITLE);

        JFrame frame = new JFrame(TITLE);
        JPanel panel = new JPanel();
        JButton instructions = new JButton(INSTRUCTIONS);
        JButton play = new JButton(PLAY);
        JButton highScores = new JButton( HIGHSCORES);

        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.add( panel );

        panel.setLayout( new BoxLayout( panel, BoxLayout.Y_AXIS ) );

    }


}
