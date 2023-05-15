
import java.io.File;

public class Uebung1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\s53034\\IdeaProjects\\Programmieren3\\test.txt");

            System.out.println("Does this file exist? " + file.exists());
            System.out.println("Name of the File: " + file.getName());
            System.out.println("Parent Directory of the File: " + file.getParent());
            System.out.println("Path to this File: " + file.getAbsolutePath());
            System.out.println("Is this a directory? " + file.isDirectory());
            System.out.println("Is this a file? " + file.isFile());
            System.out.println("Is this file readable? " + file.canRead());
            System.out.println("Is this File writable? " + file.canWrite());
            System.out.println("File Size: " + file.length() + " bytes");


            // create a new  empty file

        File file2 = new File("k.text");
        try{
        file2.createNewFile();
        }
        catch (Exception e){    }

        }
    }


