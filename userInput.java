// About some user inputs

//using buffer reader we can read text from a character-input stream, buffering characters to provide efficient reading of characters, arrays, and lines.
// It is particularly useful when wrapping around a Reader whose read operations may be costly, such as FileReaders and InputStreamReaders.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class userInput {
    public static void main(String[] args) {
        // Create a BufferedReader object to read from the console
        //FileReader fr=new FileReader("file.txt");// we can reading file or otherwise we can use InputStreamReader.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Prompt the user for input
            System.out.println("Enter your name:");

            // Read the user input
            String name = reader.readLine();

            // Display the input
            System.out.println("Hello, " + name + "!");

        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
        } finally {
            // Close the BufferedReader
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println("Error closing BufferedReader.");
            }
        }
    }
}
