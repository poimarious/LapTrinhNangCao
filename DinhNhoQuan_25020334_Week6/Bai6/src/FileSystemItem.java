abstract class FileSystemItem {
    protected String name;
    protected Folder parent;

    public FileSystemItem(String name) {
        this.name = name;
    }

    public void setParent(Folder Parent) {
        this.parent = parent;
    }

    public String getPath() {
        if(parent == null) return "/" + name;
        return parent.getPath() + "/" + name;
    }

    public abstract void print(String indent);
}
