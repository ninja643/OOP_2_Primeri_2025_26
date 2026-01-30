package rs.ac.ni.pmf.oop2.primeri.exceptions;

import java.io.IOException;
import java.net.MalformedURLException;

public class ExceptionsDemo {
    public static void main(final String[] args) {
//        final Calculator calculator = new Calculator();
//
//        double result = calculator.divide(10, 2);
//        System.out.println(result);
//
        int result = NumberInputReader.read();
        System.out.println(result);

        final HttpDownloader downloader = new HttpDownloader();

        try {
            downloader.download("http://www.google.com");
        } catch (final MalformedURLException e) {
            System.out.println("URL is not valid");
        } catch (final IOException | AuthenticationException e) {
            System.out.println(e.getMessage());
        } catch (final BlackListURLException e) {
            System.out.println("Sorry, this website is blacklisted.");
        } catch (final TooLongWaitTimeException e) {
            System.out.println("Too long wait time: " + e.getWaitTime());
        }
    }
}
