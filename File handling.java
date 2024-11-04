import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        try {
            // Create input and output files
            FileWriter fw = new FileWriter("output.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            FileReader fr = new FileReader("input.txt");
            BufferedReader br = new BufferedReader(fr);

            // Read data from input.txt and write it to output.txt
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            // Close files
            br.close();
            fr.close();
            bw.close();
            fw.close();

            System.out.println("Data copied from input.txt to output.txt successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
