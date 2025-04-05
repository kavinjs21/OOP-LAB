interface Exportable {
    void export(String content);
}

class PDFExporter implements Exportable {
    public void export(String content) {
        System.out.println("Exporting content to PDF: " + content);
    }
}

class WordExporter implements Exportable {
    public void export(String content) {
        System.out.println("Exporting content to Word: " + content);
    }
}

public class DocumentExport {
    public static void main(String[] args) {
        Exportable ex1 = new PDFExporter();
        Exportable ex2 = new WordExporter();

        ex1.export("Annual Report 2024");
        ex2.export("Project Plan Document");
    }
}
