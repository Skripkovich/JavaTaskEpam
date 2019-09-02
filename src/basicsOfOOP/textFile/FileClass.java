package basicsOfOOP.textFile;

abstract class  FileClass {

    private String name;
    private Directory directory;

    public abstract void createFile (String s);
    public abstract void rename (String name, String s);
    public abstract void print ();
    public abstract void addFile (String s);
    public abstract void deleteDate();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }

    public Directory getDirectory() {
        return directory;
    }

    public  FileClass (String name, Directory directory){

        this.name = name;
        this.directory = directory;
    }
}
