public class FileItem extends FileSystemItem {
    private long size;

    public FileItem(String name, long size) {
        super(name);
        this.size = size;
    }
    
    public void print(String indent) {
        System.out.println(indent + String.format("File: %s (%dKB)", name, size));
    } 
}
