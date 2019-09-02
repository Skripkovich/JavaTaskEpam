package basicsOfOOP.textFile;

import java.io.*;

class TextFile extends FileClass{

    public TextFile (String name, Directory directory){

        super(name, directory);
    }

    @Override
    public void createFile (String s){

        java.io.File file = new java.io.File(getName());
        FileWriter fw = null;

        try {
            file.createNewFile();
            fw = new FileWriter(file);
            fw.write(s);
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void rename(String name, String s) {
        setName(name);
        setName(name);
        createFile(s);
    }

    @Override
    public void print() {

        String s = "";
        String line;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(getName()));
            while ((line = reader.readLine()) != null) {
                s += line;
            }
            System.out.println(s);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    @Override
    public void addFile(String s){

        FileWriter fw = null;

        try {
            fw = new FileWriter(getName(), true);
            fw.write(s);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            try {
                fw.close();
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void deleteDate (){

        FileWriter fw = null;
        try {
            fw = new FileWriter(getName(), false);
            fw.write("");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            try {
                fw.close();
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
