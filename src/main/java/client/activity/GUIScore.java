package client.activity;

import client.gui.GUIComponent;

import java.awt.*;
import java.awt.image.BufferedImage;

public class GUIScore extends GUIComponent {

    /**
     * Setting for score buttons
     * @param x
     * @param img
     */
    public GUIScore(int x, BufferedImage img) {
        super(-x,5,95,40);
        setHorizontalAlign(RIGHT);
        setBackground(Color.RED);
    }
}
