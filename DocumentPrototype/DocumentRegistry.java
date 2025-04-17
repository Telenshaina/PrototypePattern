package DocumentPrototype;
import java.util.HashMap;
import java.util.Map;

public class DocumentRegistry {
    private Map<String, Document> prototypes = new HashMap<>();

    public DocumentRegistry() {
        prototypes.put("pdf", new PdfDocument("default.pdf", "Default Author", 1, "Default PDF"));
        prototypes.put("text", new TextDocument("default.txt", "ASCII", 0));
        prototypes.put("spreadsheet", new SpreadsheetDocument("default.xlsx", 0, 0));
    }

    public Document createPdfDocument(String fileName, String author, int pageCount) {
        PdfDocument pdfPrototype = (PdfDocument) prototypes.get("pdf");
        PdfDocument newPdf = pdfPrototype.clone();
        newPdf.setFileName(fileName);
        newPdf.setAuthor(author);
        newPdf.setPageCount(pageCount);
        return newPdf;
    }

    public Document createTextDocument(String filePath, String encoding, int wordCount) {
        TextDocument textPrototype = (TextDocument) prototypes.get("text");
        TextDocument newText = textPrototype.clone();
        newText.setFilePath(filePath);
        newText.setEncoding(encoding);
        newText.setWordCount(wordCount);
        return newText;
    }

    public Document createSpreadsheetDocument(String spreadsheetName, int rowCount, int columnCount) {
        SpreadsheetDocument spreadsheetPrototype = (SpreadsheetDocument) prototypes.get("spreadsheet");
        SpreadsheetDocument newSpreadsheet = spreadsheetPrototype.clone();
        newSpreadsheet.setSpreadsheetName(spreadsheetName);
        newSpreadsheet.setRowCount(rowCount);
        newSpreadsheet.setColumnCount(columnCount);
        return newSpreadsheet;
    }
}