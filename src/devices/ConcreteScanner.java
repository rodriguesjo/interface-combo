package devices;

// A classe ConcreteScanner representa um dispositivo que combina as funcionalidades definidas
// pela classe abstrata Device e pela interface Scanner.
public class ConcreteScanner extends Device implements Scanner {

    // Construtor da classe que inicializa o número de série do dispositivo.
    public ConcreteScanner(String serialNumber) {
        super(serialNumber); // Chama o construtor da classe pai Device para configurar o número de série.
    }

    // Implementação do método abstrato processDoc da classe Device.
    // Este método simula o processamento de um documento pelo scanner.
    @Override
    public void processDoc(String doc) {
        System.out.println("Scanner processing: " + doc); // Exibe o documento que está sendo processado.
    }

    // Implementação do método scan da interface Scanner.
    // Este método simula a digitalização de um documento, retornando o conteúdo digitalizado.
    @Override
    public String scan() {
        return ("Scanned content"); // Retorna uma string representando o conteúdo digitalizado.
    }    

}
