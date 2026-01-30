package rs.ac.ni.pmf.oop2.primeri.io_streams;

import java.io.IOException;

public class StreamsDemo {
    public static void main(final String[] args) throws IOException {
        final FileManager fileManager = new FileManager();
//        fileManager.copyFile("in.txt", "out.txt");

//        fileManager.createNumbersFile("numbers.txt");
//        fileManager.readBytesFromFile("numbers.txt");

        fileManager.createLargeFile("large.txt");
    }
}
