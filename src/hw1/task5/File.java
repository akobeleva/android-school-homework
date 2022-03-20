package hw1.task5;

public class File extends BaseFileSystemNode {
    public File(AbstractFileSystemNode parent, String name) {
        super(parent, name);
    }

    public String getExtension() {
        String[] nameArray = this.getName().split("\\.");
        return nameArray[nameArray.length - 1];
    }
}
