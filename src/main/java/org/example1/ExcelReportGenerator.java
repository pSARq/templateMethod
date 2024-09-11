package org.example1;

public class ExcelReportGenerator extends ReportGenerator {
    @Override
    protected String gatherData() {
        return "Datos para el reporte Excel ...";
    }

    @Override
    protected String formatReport(String data) {
        return "Reporte Excel formateado: " + data;
    }
}
