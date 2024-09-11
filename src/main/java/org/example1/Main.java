package org.example1;

public class Main {
    public static void main(String[] args) {
        ReportGenerator pdfReport = new PDFReportGenerator();
        pdfReport.generateReport();

        System.out.println();

        ReportGenerator excelReport = new ExcelReportGenerator();
        excelReport.generateReport();
    }
}