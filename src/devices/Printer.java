package devices;

public class Printer extends Device{

	public Printer(String serialNumber) {
		super(serialNumber);
	}
	
	public void processDoc(String doc) {
		System.out.println("Print processing: " + doc);
	}
	
	public void print(String doc) {
		System.out.println("Printing: " + doc);
	}
}
