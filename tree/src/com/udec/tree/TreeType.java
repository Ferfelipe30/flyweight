package com.udec.tree;

import java.awt.Color;
import java.awt.Graphics;

/*
 * @author Juan Felipe Fernandez Gomez
 */

public class TreeType {
    private String name;
    private Color color;
    private String otherTreeData;
    
    public TreeType(String name, Color color, String otherTreeDate){
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeDate;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }
    
}
