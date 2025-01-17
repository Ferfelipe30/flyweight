package com.udec.tree;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import java.util.List;

/*
 * @author Juan Felipe Fernandez Gomez
 */

public class Forest extends JFrame{
    private List<Tree> trees = new ArrayList<>();
    
    public void plantTree(int x, int y, String name, Color color, String otherTreeData){
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }
    
    @Override
    public void paint(Graphics graphics){
        for(Tree tree : trees){
            tree.draw(graphics);
        }
    }
}
