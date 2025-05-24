
import java.io.*;
import java.nio.file.*;

public class FileHandlingDemo {

    public static void main(String[] args) {
        String filename = "example.txt";

        // 1. Create and Write to File
        try {
            FileWriter writer = new FileWriter(filename); // creates or overwrites
            writer.write("Hello, this is the first line.\n");
            writer.write("This is the second line.");
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // 2. Append to File
        try {
            FileWriter writer = new FileWriter(filename, true); // true = append
            writer.write("\nThis line was appended.");
            writer.close();
            System.out.println("File appended successfully.");
        } catch (IOException e) {
            System.out.println("Error appending to file: " + e.getMessage());
        }

        // 3. Read from File
        try {
            FileReader reader = new FileReader(filename);
            BufferedReader br = new BufferedReader(reader);
            String line;
            System.out.println("\nContents of the file:");
            while ((line = br.readLine()) != null) {
                System.out.println("  " + line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // 4. Check if File Exists
        File file = new File(filename);
        if (file.exists()) {
            System.out.println("\nFile '" + filename + "' exists.");
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("File size: " + file.length() + " bytes");
        } else {
            System.out.println("File does not exist.");
        }

        // 5. Delete File
        try {
            Files.deleteIfExists(Paths.get(filename));
            System.out.println("\nFile deleted successfully.");
        } catch (IOException e) {
            System.out.println("Error deleting file: " + e.getMessage());
        }
    }
}
