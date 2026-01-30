package rs.ac.ni.pmf.oop2.primeri.exceptions;

import lombok.Getter;

public class TooLongWaitTimeException extends Exception {
    @Getter
    private final long waitTime;

    public TooLongWaitTimeException(final long waitTime) {
        this.waitTime = waitTime;
    }
}
