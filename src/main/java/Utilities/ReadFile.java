package Utilities;

import java.io.File;

public class ReadFile {
    public static File[] getFiles(String path) {
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        return listOfFiles;
    }
}
