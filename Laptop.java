
public class Laptop extends Computer{
	
	int HDMI;

	public Laptop(String itemType,int ID, double price, int stock, String manu, String brand, int voltage, int maxWatt, String OS,
			String CPU, int RAM, int HDD,int HDMI) {
		super(itemType,ID, price, stock, manu, brand, voltage, maxWatt, OS, CPU, RAM, HDD);
		this.HDMI=HDMI;

	}

	public int getHDMI() {
		return HDMI;
	}

	public void setHDMI(int hDMI) {
		HDMI = hDMI;
	}
	
	
	public String toString(){
		return ("-----------------------\nType: "
				+ "Laptop\nItem ID: "+getID()+"\n"
				+ "Price: "+getPrice()+" $"+
				" \nManufacturer: : "
				+getManu()+"\n"+"Brand: "+getBrand()+
				"\nMax Volt: : "+getVoltage()+" V."+
				"\nMax Watt: "+getMaxWatt()+" W."+
				"\nOperating System: "+getOS()+
				"\nCPU Type: "+getCPU()+
				"\nRAM Capacity: "+getRAM()+" GB"+
				"\nHDD Capacity: "+getHDD()+" GB"+
				"\nHDMI support: ")+ (getHDMI()==1 ? "Yes" :"No"
				);
		
	}

}
