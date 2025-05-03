import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LocalFileStorage implements FileStorageService {
    private static final String UPLOAD_DIR = "uploads/";

    public LocalFileStorage() {
        try {
            Files.createDirectories(Paths.get(UPLOAD_DIR));
        } catch (IOException e) {
            System.out.println("Could not create upload directory: " + e.getMessage());
        }
    }

    @Override
    public String saveFile(File file) {
        try (FileOutputStream out = new FileOutputStream(UPLOAD_DIR + file.getName())) {
            out.write(file.getData());
            return "Upload successful: " + file.getName();
        } catch (IOException e) {
            return "Upload failed: " + e.getMessage();
        }
    }
}

