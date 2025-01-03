package devices;

// A classe abstrata Device serve como uma base para dispositivos genéricos.
// Ela define atributos e métodos comuns que podem ser compartilhados por todas as subclasses.
public abstract class Device {

	// O atributo serialNumber armazena o número de série do dispositivo.
	private String serialNumber;

	// Construtor da classe Device, que inicializa o número de série do dispositivo.
	public Device(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	// Getter para acessar o número de série do dispositivo.
	public String getSerialNumber() {
		return serialNumber;
	}

	// Setter para atualizar o número de série do dispositivo.
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	// Método abstrato que obriga as subclasses a implementar a lógica para
	// processar documentos.
	// O método define a assinatura, mas não fornece uma implementação aqui.
	public abstract void processDoc(String doc);
}
