package ReadWrite;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Write {
    public static void write(String transformation,
                             String plaintextFileName, byte[] output) {
        String outFile = "";
        String[] parts = transformation.split("/");
        if (parts.length == 3 && parts[0].equals("AES")) {
            outFile = plaintextFileName + ".aes";
        } else {Throwable Exception;}
        try {
            Files.write(Paths.get(outFile), output);
        } catch (Exception e) { e.printStackTrace(); }
    }
}
