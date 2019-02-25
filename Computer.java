
public class Computer extends Electronic{
	String OS;
	String CPU;
	int RAM;
	int HDD;

	public Computer(String itemType,int ID, double price, int stock, String manu, String brand, int voltage, int maxWatt,String OS,String CPU
			,int RAM,int HDD) {
		super(itemType,ID, price, stock, manu, brand, voltage, maxWatt);
		this.OS=OS;
		this.CPU=CPU;
		this.RAM=RAM;
		this.HDD=HDD;
		
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public String getCPU() {
		return CPU;
	}

	public void setCPU(String cPU) {
		CPU = cPU;
	}

	public int getRAM() {
		return RAM;
	}

	public void setRAM(int rAM) {
		RAM = rAM;
	}

	public int getHDD() {
		return HDD;
	}

	public void setHDD(int hDD) {
		HDD = hDD;
	}
	

}
