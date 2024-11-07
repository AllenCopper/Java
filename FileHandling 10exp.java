import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileHandle {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("output.txt");
        FileWriter fw = new FileWriter("new_output.txt",true);

        int ch;
        System.out.println("Reading from the output file and writing to new_output.txt...");

        // Read each character from source file and write to destination file
        while ((ch = fr.read()) != -1) {
            // Print each character to the console (optional)
            System.out.print((char) ch);

            // Write each character to the destination file
            fw.write(ch);
        }

        // Close file resources
        fr.close();
        fw.close();

        System.out.println("\nFile content copied successfully!");
    }
}