package com.udec.tree;

import java.awt.Graphics;

/*
 * @author Juan Felipe Fernandez Gomez
 */

public class Tree {
    private int x;
    private int y;
    private TreeType type;
    
    public Tree(int x, int y, TreeType type){
        this.x = x;
        this.y = y;
        this.type = type;
    }
    
    public void draw(Graphics g){
        type.draw(g, x, y);
    }
}
