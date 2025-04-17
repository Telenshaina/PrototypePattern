package DocumentPrototype;

public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        Document annualReport = registry.createPdfDocument("annual_report_2024.pdf", "Acme Corp", 150);
        System.out.println();
        annualReport.open();
        System.out.println("Type: " + annualReport.getType() + ", File: " + ((PdfDocument) annualReport).getFileName() + ", Author: " + ((PdfDocument) annualReport).getAuthor() + ", Pages: " + ((PdfDocument) annualReport).getPageCount());
        

        Document meetingNotes = registry.createTextDocument("meeting_notes.txt", "UTF-8", 250);
        System.out.println();
        meetingNotes.open();
        System.out.println("Type: " + meetingNotes.getType() + ", Path: " + ((TextDocument) meetingNotes).getFilePath() + ", Encoding: " + ((TextDocument) meetingNotes).getEncoding() + ", Words: " + ((TextDocument) meetingNotes).getWordCount());
        

        Document salesData = registry.createSpreadsheetDocument("sales_data_q1.xlsx", 1000, 20);
        System.out.println();
        salesData.open();
        System.out.println("Type: " + salesData.getType() + ", Name: " + ((SpreadsheetDocument) salesData).getSpreadsheetName() + ", Rows: " + ((SpreadsheetDocument) salesData).getRowCount() + ", Columns: " + ((SpreadsheetDocument) salesData).getColumnCount());
        

        Document summaryReport = registry.createPdfDocument("summary_report.pdf", "Acme Corp", 30);
        System.out.println();
        summaryReport.open();
    }
}