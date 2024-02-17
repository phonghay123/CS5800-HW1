import java.util.ArrayList;

import java.util.List;
class Folder{
    private String name;
    private List<File> files;

    private List<Folder> subFolders;

    public Folder(String name)
    {
        this.name = name;
        this.subFolders = new ArrayList<>();
        this.files = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Folder> getSubFolders() {
        return subFolders;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public void setSubFolders(List<Folder> subFolders) {
        this.subFolders = subFolders;
    }

    public void addSubFolders(Folder subFolder)
    {
        subFolders.add(subFolder);
    }
    public void addFile(File file)
    {
        files.add(file);
    }

    public void removeSubFolder(Folder subFolder)
    {
        subFolders.remove(subFolder);
    }
    public void removeFile(File file) {
        files.remove(file);
    }
    public void print(int indent) {
        System.out.println("Folder: " + name);
        for (File file : files) {
            file.print(indent);
        }
        for (Folder subFolder : subFolders) {
            for(int i = 0; i < indent; i ++)
            {
                System.out.print(" ");
            }
            subFolder.print(indent + 4);
        }
    }
}

class File{
    private String name;
    private Folder folder;
    public File(String name, Folder folder) {
        this.name = name;
        this.folder = folder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }

    public void print(int indent) {
        for(int i = 0; i < indent; i ++)
        {
            System.out.print(" ");
        }
        System.out.println("File: " + name);
    }

}
public class Composition {
    public static void main(String[] args) {
        //Initialize all the folders in the example
        Folder folder = new Folder("php_demo1");
        Folder source = new Folder("Source Files");
        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");
        Folder cache = new Folder("cache");
        Folder publi = new Folder("public");
        publi.addFile(new File(".htaccess",publi));
        publi.addFile(new File(".htrouter.php",publi));
        publi.addFile(new File("index.html",publi));

        Folder includePath = new Folder("Include Path");
        Folder remoteFiles = new Folder("Remote Files");

        //adding sub folder to recreate the structure

        app.addSubFolders(config);
        app.addSubFolders(controllers);
        app.addSubFolders(library);
        app.addSubFolders(migrations);
        app.addSubFolders(models);
        app.addSubFolders(views);
        source.addSubFolders(phalcon);
        source.addSubFolders(app);
        source.addSubFolders(cache);
        source.addSubFolders(publi);
        folder.addSubFolders(source);

        //Demo
        int indent = 4;
        folder.print(indent);
        source.removeSubFolder(app);
        System.out.println("After remove folder app");
        folder.print(indent);
        source.removeSubFolder(publi);
        System.out.println("After remove folder public");
        folder.print(indent);

    }

}
