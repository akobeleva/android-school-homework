package hw1.task5;

import java.util.ArrayList;
import java.util.Collections;


public class Folder extends BaseFileSystemNode {
    private ArrayList<BaseFileSystemNode> children;

    public Folder(BaseFileSystemNode parent, String name, BaseFileSystemNode ... children){
        super(parent, name);
        this.children = new ArrayList<>(children.length);
        Collections.addAll(this.children, children);
        this.children.forEach((child)->child.setParent(this));
    }

    public ArrayList<BaseFileSystemNode> getChildren(){
        return children;
    }
}
