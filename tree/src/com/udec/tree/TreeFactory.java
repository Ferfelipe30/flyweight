package com.udec.tree;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

/*
 * @author Juan Felipe Fernandez Gomez
 */

public class TreeFactory {
    static Map<String, TreeType> treeType = new HashMap<>();
    
    public static TreeType getTreeType(String name, Color color, String otherTreeData){
        TreeType result = treeType.get(name);
        if (result == null) {
            result = new TreeType(name, color, otherTreeData);
            treeType.put(name, result);
        }
        return result;
    }
}
