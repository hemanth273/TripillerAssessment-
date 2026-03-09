package module5Assesment;

import java.io.*;

 class ThrowsDemo {

    // method declares that it may throw IOException
    static void readFile() throws IOException {
        FileReader fr = new FileReader("test.txt");  // may throw IOException
        fr.close();
    }

    public static void main(String[] args) {
        try {
            readFile();   // call method that may throw exception
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}