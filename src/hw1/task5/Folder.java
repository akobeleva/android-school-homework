package hw1.task5;

import java.util.ArrayList;
import java.util.Collections;


public class Folder extends AbstractFileSystemNode {
    private final ArrayList<FileSystemNode> children;

    public Folder(String name, FileSystemNode... children) {
        super(name);
        this.children = new ArrayList<>(children.length);
        Collections.addAll(this.children, children);
        this.children.forEach((child) -> child.setParent(this));
    }

    public ArrayList<FileSystemNode> getChildren() {
        return children;
    }
}
