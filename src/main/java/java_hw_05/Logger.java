package java_hw_05;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Logger {
    public static void logging(String text) {
        LocalDateTime dateTime = LocalDateTime.now();
        try (FileWriter fileWriter = new FileWriter("log.csv", true)) {
            fileWriter.append(dateTime + text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
