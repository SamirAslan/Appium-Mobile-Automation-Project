package example.util;

import java.util.concurrent.TimeUnit;

public final class ThreadUtil {
    private ThreadUtil() {
    }

    public static void sleep(long timeSecond) {
        try {
            TimeUnit.SECONDS.sleep(timeSecond);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread interrupted");
        }
    }
}
