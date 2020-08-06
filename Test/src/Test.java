import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.*;

public class Test {
    public static void main(String[] args) {

        Path pathSource = Paths.get("D:\\Test");
        try {
            delete(pathSource.toFile());
            Files.createDirectory(pathSource);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void delete(File f) throws IOException {
        if (f.isDirectory()) {
            for (File c : f.listFiles())
                delete(c);
        }
        if (!f.delete())
            throw new FileNotFoundException("Failed to delete file: " + f);
    }
}