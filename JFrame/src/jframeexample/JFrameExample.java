package jframeexample;

import java.awt.*;
import javax.swing.*;

public class JFrameExample implements Runnable
{
    public static void main(String[] args)
    {
        JFrameExample example = new JFrameExample();
        // schedule this for the event dispatch thread (edt)
        SwingUtilities.invokeLater(example);
    }

    public void run()
    {
        JFrame frame = new JFrame("My JFrame Example");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400, 200));
        frame.pack();
        frame.setVisible(true);
    }
}