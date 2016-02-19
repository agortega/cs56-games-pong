import edu.ucsb.cs56.projects.games.pong.window.JFrameBuilder;
import org.junit.Test;

import javax.swing.*;

/**
 * Created by angelortega on 2/18/16.
 */
public class WindowTest {

    private JFrameBuilder builder = new JFrameBuilder();

    @Test
    public JFrameBuilder addTitle() {
        builder.addTitle("Main Menu");
        builder.addDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame window = builder.build();
    }
}
