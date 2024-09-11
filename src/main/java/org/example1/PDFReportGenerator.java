package org.example1;

public class PDFReportGenerator extends ReportGenerator {
    @Override
    protected String gatherData() {
        return "Datos para el reporte PDF ...";
    }

    @Override
    protected String formatReport(String data) {
        return "Reporte PDF formateado: " + data;
    }
}
