package hw1.task5;

public interface FileSystemNode {
    void setParent(FileSystemNode parent);

    FileSystemNode getParent();

    String getName();

    String getPath();
}
