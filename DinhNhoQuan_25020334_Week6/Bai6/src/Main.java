public class Main {
	public static void main(String[] args) {
        Folder root = new Folder("root");
        Folder docs = new Folder("docs");
        FileItem aFile = new FileItem("a.txt", 12);
        FileItem bFile = new FileItem("b.txt", 8);
        Shortcut aShotcut = new Shortcut("a-shortcut", aFile);
        FileItem readme = new FileItem("readme.md", 4);

        docs.add(aFile);
        docs.add(bFile);
        docs.add(aShotcut);

        root.add(docs);
        root.add(readme);
        root.print("");
    }
 }
