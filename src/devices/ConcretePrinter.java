package devices;

// A classe ConcretePrinter representa um dispositivo de impressão concreto, implementando a interface Printer
// e estendendo a classe abstrata Device.
public class ConcretePrinter extends Device implements Printer {

    // Construtor que inicializa o número de série do dispositivo.
    public ConcretePrinter(String serialNumber) {
        super(serialNumber); // Chamada ao construtor da classe base Device para inicializar o número de série.
    }
    
    // Implementação do método abstrato processDoc da classe Device.
    // Este método simula o processamento de um documento para impressão.
    @Override
    public void processDoc(String doc) {
        System.out.println("Print processing: " + doc); // Exibe a mensagem indicando que o documento está sendo processado.
    }
    
    // Implementação do método print da interface Printer.
    // Este método simula a impressão de um documento.
    @Override
    public void print(String doc) {
        System.out.println("Printing: " + doc); // Exibe a mensagem indicando que o documento está sendo impresso.
    }
}
