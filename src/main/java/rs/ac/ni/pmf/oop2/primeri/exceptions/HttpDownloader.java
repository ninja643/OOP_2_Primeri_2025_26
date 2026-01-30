package rs.ac.ni.pmf.oop2.primeri.exceptions;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class HttpDownloader {
    private final Random random = new Random();

    public void download(final String address)
            throws MalformedURLException, IOException, BlackListURLException, TooLongWaitTimeException, AuthenticationException {

        if (random.nextBoolean()) {
            throw new AuthenticationException("Sorry, you're not allowed to download now");
        }

        if (isBlacklisted(address)) {
            throw new BlackListURLException();
        }

        final long estimatedWaitTime = estimateWaitTime();
        if (estimatedWaitTime > 20) {
            throw new TooLongWaitTimeException(estimatedWaitTime);
        }

        final URL url = new URL(address);

        final URLConnection connection = url.openConnection();
        connection.connect();

        System.out.println("Downloading from: " + address);
    }

    private boolean isBlacklisted(final String address) {
        return "http://www.google.com".equals(address);
    }

    private long estimateWaitTime() {
        return random.nextInt(100);
    }
}
