package hw1.task5;

public abstract class AbstractFileSystemNode implements FileSystemNode {
    private final String name;
    private FileSystemNode parent;

    public AbstractFileSystemNode(String name) {
        this.parent = null;
        this.name = name;
    }

    @Override
    public void setParent(FileSystemNode parent) {
        this.parent = parent;
    }

    @Override
    public final FileSystemNode getParent() {
        return parent;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public final String getPath() {
        FileSystemNode parent = getParent();
        StringBuilder sb = new StringBuilder();
        while (parent != null) {
            sb.insert(0, "/").insert(1, parent.getName());
            parent = parent.getParent();
        }
        sb.append("/").append(getName());
        return new String(sb);
    }
}
