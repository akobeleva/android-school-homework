package hw1.task5;

public abstract class AbstractFileSystemNode implements FileSystemNode{
    private String name;
    private AbstractFileSystemNode parent;

    public AbstractFileSystemNode(AbstractFileSystemNode parent, String name){
        this.parent = parent;
        this.name = name;
    }

    @Override
    public void setParent(FileSystemNode parent) {
        this.parent = (AbstractFileSystemNode) parent;
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
        AbstractFileSystemNode parent = (AbstractFileSystemNode) getParent();
        StringBuilder sb = new StringBuilder();
        while (parent != null) {
            sb.insert(0, "/").insert(1, parent.getName());
            parent = (AbstractFileSystemNode) parent.getParent();
        }
        sb.append("/").append(getName());
        return new String(sb);
    }
}
