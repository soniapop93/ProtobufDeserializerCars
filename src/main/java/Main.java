import Utilities.ReadFile;
import cars.generated.Car;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String path = "";

        File[] listOfFiles = ReadFile.getFiles(path);

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("File name: " + listOfFiles[i].getName());

                Path filePath = Paths.get(listOfFiles[i].getPath());

                Car car = null;
                try {
                    car = Car.parseFrom(Files.newInputStream(filePath));
                    System.out.println(car.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
