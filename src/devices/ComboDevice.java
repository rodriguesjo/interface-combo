package devices;

// A classe ComboDevice representa um dispositivo multifuncional que pode imprimir e escanear documentos.
// Ela estende a classe abstrata Device e implementa as interfaces Printer e Scanner.
public class ComboDevice extends Device implements Scanner, Printer {

    // Construtor que inicializa o número de série do dispositivo.
    public ComboDevice(String serialNumber) {
        super(serialNumber); // Chama o construtor da classe base Device para inicializar o número de série.
    }

    // Implementação do método print da interface Printer.
    // Este método simula a impressão de um documento.
    @Override
    public void print(String doc) {
        System.out.println("Combo printing: " + doc); // Exibe uma mensagem indicando que o documento está sendo impresso.
    }

    // Implementação do método scan da interface Scanner.
    // Este método simula o escaneamento de um documento.
    @Override
    public String scan() {
        return "Combo scan result"; // Retorna uma string indicando o resultado do escaneamento.
    }

    // Implementação do método abstrato processDoc da classe Device.
    // Este método simula o processamento de um documento.
    @Override
    public void processDoc(String doc) {
        System.out.println("Combo processing: " + doc); // Exibe uma mensagem indicando que o documento está sendo processado.
    }
}
