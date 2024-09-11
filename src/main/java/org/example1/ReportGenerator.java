package org.example1;

public abstract class ReportGenerator {

    /*El patron esta en este método, ya que consiste en definir un paso a paso de como se deben ejecutar
    * los métodos y este método no se puede sobreescribir desde las subclases por eso se coloca como "final",
    * mientras que el resto de métodos si se pueden sobreescribir ya sea que se le asigne un comportamiento
    * desde la clase base o se defina un método como abstracto.
    * La diferencia del patron a una clase abstracta normal, es que en una clase abstracta yo puedo
    * definir unos métodos, pero no necesariamente un método principal con el paso a paso de como se deben de ejecutar,
    * a diferencia del patron en el que ese método principal en la clase abstracta si es obligatorio */
    public final void generateReport() {
        String data = gatherData();
        String formattedReport = formatReport(data);
        printReport(formattedReport);
    }

    protected abstract String gatherData();

    protected abstract String formatReport(String data);

    protected void printReport(String report) {
        System.out.println("Imprimiendo el reporte");
        System.out.println(report);
    }
}
