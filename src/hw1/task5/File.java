package hw1.task5;

public class File extends AbstractFileSystemNode {
    public File(String name) {
        super(name);
    }

    public String getExtension() {
        String[] nameArray = this.getName().split("\\.");
        if (nameArray.length > 1) return nameArray[nameArray.length - 1];
        else return "No extension";
    }
}
