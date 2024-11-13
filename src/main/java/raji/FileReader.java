package raji;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {
        File file = new File("src/main/java/raji/example.txt"); // Replace with the actual file path

        try (Scanner scanner = new Scanner(file)) {
            if (!scanner.hasNext()) {
                throw new IOException("File is empty");
            }

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
