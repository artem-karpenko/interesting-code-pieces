import java.io.IOException;

/**
 * Question - what error will the compiler throw.
 */
public class ExceptionalIntelligence {
    public static void main(String[] args) {
        try {
            if (args.length > 0) {
                throw new IOException();
            } else {
                throw new InterruptedException();
            }
        } catch (Throwable e) {
            throw e;
        }
    }
}
