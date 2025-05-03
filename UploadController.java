public class UploadController {
    private final FileStorageService storage;

    public UploadController(FileStorageService storage) {
        this.storage = storage;
    }

    public String handleUpload(File file) {
        if (!file.isValid()) {
            return "Invalid file. Must be pdf/docx/zip and under 10MB.";
        }
        return storage.saveFile(file);
    }
}
