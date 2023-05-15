import java.io.File;

public class Uebung3{
    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\s53034\\IdeaProjects\\Programmieren3";
        listFilesAndDirectories(directoryPath);
    }

    public static void listFilesAndDirectories(String directoryPath) {
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            System.out.println("Directory does not exist.");
            return;
        }
        System.out.println("Original Path: " + directory.getAbsolutePath());

        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println("File: " + file.getAbsolutePath());
                } else if (file.isDirectory()) {
                    System.out.println("Directory: " + file.getAbsolutePath());
                    listFilesAndDirectories(file.getAbsolutePath());
                }
            }
        }
    }
}
