//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Simulating file upload with dummy data
        byte[] data = "This is a sample file content.".getBytes();
        File file = new File("report.pdf", "pdf", data.length, data);

        UploadController controller = new UploadController(new LocalFileStorage());
        String response = controller.handleUpload(file);
        System.out.println(response);
    }
}