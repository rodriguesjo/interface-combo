package application;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class Program {

    public static void main(String[] args) {
        
        // Criação de uma instância da classe ConcretePrinter, representando uma impressora.
        ConcretePrinter p = new ConcretePrinter("1080"); // Número de série: 1080.
        p.processDoc("my letter"); // Simula o processamento do documento "my letter".
        p.print("My letter"); // Simula a impressão do documento "My letter".
        
        System.out.println("-----------------"); // Separador para organizar a saída no console.

        // Criação de uma instância da classe ConcreteScanner, representando um escâner.
        ConcreteScanner s = new ConcreteScanner("2003"); // Número de série: 2003.
        s.processDoc("My Email"); // Simula o processamento do documento "My Email".
        System.out.println("Scan result: " + s.scan()); // Exibe o resultado do escaneamento.

        System.out.println("-----------------"); // Separador para organizar a saída no console.

        // Criação de uma instância da classe ComboDevice, representando um dispositivo multifuncional.
        ComboDevice cd = new ComboDevice("2081"); // Número de série: 2081.
        cd.processDoc("My dissertation"); // Simula o processamento do documento "My dissertation".
        cd.print("My dissertation"); // Simula novamente o processamento do mesmo documento.
        System.out.println("Scan result: " + cd.scan()); // Exibe o resultado do escaneamento do dispositivo multifuncional.
    }
}
