package devices;

// A interface Printer define o contrato para classes que implementam funcionalidades de impressão.
public interface Printer {

    // Método abstrato que deve ser implementado por qualquer classe que assine esta interface.
    // Este método representa a operação de imprimir um documento.
    void print(String doc);

}
