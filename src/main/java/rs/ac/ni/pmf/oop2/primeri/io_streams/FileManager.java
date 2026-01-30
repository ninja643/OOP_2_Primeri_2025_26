package rs.ac.ni.pmf.oop2.primeri.io_streams;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileManager {
    public void copyFile(final String source, final String destination)
            throws IOException {

        try (final FileInputStream fileInputStream = new FileInputStream(source);
             final FileOutputStream fileOutputStream = new FileOutputStream(destination)) {

            int c;

            while ((c = fileInputStream.read()) != -1) {
                if (c == 32) {
                    throw new IOException("Invalid character found!");
                }

                fileOutputStream.write(c);
            }
        }
    }

    public void createNumbersFile(final String outFileName) {
        try (final FileOutputStream fileOutputStream = new FileOutputStream(outFileName)) {
            for (int i = 0; i < 1000; i++) {
                fileOutputStream.write(i);
            }
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

    public void readBytesFromFile(final String fileName) throws IOException {
        try (final FileInputStream fileInputStream = new FileInputStream(fileName)) {
            int c;
            while ((c = fileInputStream.read()) != -1) {
                System.out.println(c);
            }
        }
    }

    public void createLargeFile(final String fileName) throws IOException {
        System.out.println("Creating file: " + fileName);
        final long startTime = System.currentTimeMillis();

        try (final BufferedOutputStream fileOutputStream =
                     new BufferedOutputStream(new FileOutputStream(fileName))) {
            for (int i = 0; i < 1_000_000_000; i++) {
                fileOutputStream.write(i);
            }
        }

        final long endTime = System.currentTimeMillis();
        System.out.println("Time elapsed: " + (endTime - startTime) + " ms.");
    }
}
