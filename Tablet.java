
public class Tablet extends Computer{
	
	int dimension;

	public Tablet(String itemType,int ID, double price, int stock, String manu, String brand, int voltage, int maxWatt, String OS,
			String CPU, int RAM, int HDD,int dimension) {
		super(itemType,ID, price, stock, manu, brand, voltage, maxWatt, OS, CPU, RAM, HDD);
		this.dimension=dimension;

	}

	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}
	
	public String toString(){
		return ("-----------------------\nType: "
				+ "Tablet\nItem ID: "+getID()+"\n"
				+ "Price: "+getPrice()+" $"+
				" \nManufacturer: : "
				+getManu()+"\n"+"Brand: "+getBrand()+
				"\nMax Volt: : "+getVoltage()+" V."+
				"\nMax Watt: "+getMaxWatt()+" W."+
				"\nOperating System: "+getOS()+
				"\nCPU Type: "+getCPU()+
				"\nRAM Capacity: "+getRAM()+" GB"+
				"\nHDD Capacity: "+getHDD()+" GB"+
				"\nDimension: "+ getDimension()
				);
		
	}

}
