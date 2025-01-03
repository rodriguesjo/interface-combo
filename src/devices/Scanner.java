package devices;

// A interface Scanner define o comportamento esperado para dispositivos que realizam digitalizações.
public interface Scanner {

    // Método abstrato que obriga as classes que implementam esta interface a fornecer uma implementação
    // para o processo de digitalização, retornando o conteúdo digitalizado como uma String.
    String scan();
}
