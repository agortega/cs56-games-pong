package edu.ucsb.cs56.projects.games.pong.window;

import javax.swing.*;

/**
 * Created by angelortega on 2/18/16.
 */
public class JFrameBuilder {

    private String title;
    private int defaultCloseOperation = JFrame.EXIT_ON_CLOSE;
    public JFrameBuilder(){

    }

    public JFrameBuilder addTitle(String title) {
        this.title = title;
        return this;
    }

    public JFrameBuilder addDefaultCloseOperation(int closeOperation) {
        defaultCloseOperation = closeOperation;
        return this;
    }

    public JFrame build() {
        JFrame frame = new JFrame();
        frame.setTitle(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout();
        return frame;
    }
}
