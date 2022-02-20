package ReadWrite;

import java.nio.file.Files;
import java.nio.file.Paths;
public class Read {
    public static byte[] readAllBytes(String plaintextFileName) {
        byte[] bytesRead = {};
        try {
            bytesRead = Files.readAllBytes(Paths.get(plaintextFileName));
        } catch (Exception e) {}
        return bytesRead; // returns {} if file does not exist
    }
}
