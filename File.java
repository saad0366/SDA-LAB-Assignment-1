public class File {
    private String name;
    private String type;
    private long size;
    private byte[] data;

    public File(String name, String type, long size, byte[] data) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.data = data;
    }

    public boolean isValid() {
        return size < 10_000_000 && (type.equals("pdf") || type.equals("docx") || type.equals("zip"));
    }

    public String getName() { return name; }
    public String getType() { return type; }
    public long getSize() { return size; }
    public byte[] getData() { return data; }
}
