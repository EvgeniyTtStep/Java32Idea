package org.polishchuk;

import java.time.Duration;
import java.time.LocalDateTime;

public class TimeUntilNewYear {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        int currentYear = now.getYear();
        LocalDateTime nextNewYear = LocalDateTime.of(currentYear + 1, 1, 1, 0, 0);

        Duration duration = Duration.between(now, nextNewYear);

        long totalSeconds = duration.getSeconds();
        long days = totalSeconds / (24 * 60 * 60);
        long remainingSeconds = totalSeconds % (24 * 60 * 60);

        long hours = remainingSeconds / (60 * 60);
        remainingSeconds = remainingSeconds % (60 * 60);

        long minutes = remainingSeconds / 60;
        long seconds = remainingSeconds % 60;

        System.out.println(days + " днів, " + hours + " годин, " + minutes + " хвилин і " + seconds + " секунд");
    }
}
