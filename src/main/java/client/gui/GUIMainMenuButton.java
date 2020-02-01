package client.gui;

import client.interact.Interactor;

import java.awt.*;

public class GUIMainMenuButton extends GUIButton implements Interactor {

    private final Color buttonColor = new Color(50, 50, 255);
    private final Color hoverColor = new Color(80, 80, 255);

    public GUIMainMenuButton( String label) {
        super(200, 40,label);
        setBackground(buttonColor);
        setHorizontalAlign(GUIComponent.CENTER);
        setVerticalAlign(GUIComponent.CENTER);
    }

    @Override
    public void hover() {
        setBackground(hoverColor);
        setScale(1.2);
    }

    @Override
    public void unhover() {
        setBackground(buttonColor);
        setScale(1);
    }
}