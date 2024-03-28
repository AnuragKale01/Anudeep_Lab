/*Assignment-1. Write a Java program that reads an input file from the file system and outputs the content of the file character by character. Use FileReader.read() method to read characters from the file. At the end, print the total number of characters present in the file. */
package Filestream;

import java.io.FileReader;
import java.io.IOException;

public class fileheader {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\ASUS\\OneDrive\\Desktop\\Anudeep/fileheaade.txt"; //  'path_to_your_file' with the actual file path
        
        try (FileReader fileReader = new FileReader(filePath)) {
            int character;
            int charCount = 0;
            
            // Read characters until the end of the file
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character); // Output each character
                charCount++; // Increment character count
            }
            
            System.out.println("\nTotal number of characters: " + charCount);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
