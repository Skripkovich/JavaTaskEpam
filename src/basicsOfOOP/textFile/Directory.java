package basicsOfOOP.textFile;

class Directory {

private String path;

public void setPath(String path) {
        this.path = path;
        }

public String getPath() {
        return path;
        }

public Directory (String path) {

        this.path = path;
        }

@Override
public String toString () {

        return "Directory{" + "path= " + path + "}";
        }
        }
