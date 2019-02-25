
public class Desktop extends Computer{
	
	String boxColor;

	public Desktop(String itemType,int ID, double price, int stock, String manu, String brand, int voltage, int maxWatt, String OS,
			String CPU, int RAM, int HDD,String boxColor) {
		super(itemType,ID, price, stock, manu, brand, voltage, maxWatt, OS, CPU, RAM, HDD);
		this.boxColor=boxColor;
		
	}

	public String getBoxColor() {
		return boxColor;
	}

	public void setBoxColor(String boxColor) {
		this.boxColor = boxColor;
	}
	public String toString(){
		return ("-----------------------\nType: "
				+ "Desktop\nItem ID: "+getID()+"\n"
				+ "Price: "+getPrice()+" $"+
				" \nManufacturer: : "
				+getManu()+"\n"+"Brand: "+getBrand()+
				"\nMax Volt: : "+getVoltage()+" V."+
				"\nMax Watt: "+getMaxWatt()+" W."+
				"\nOperating System: "+getOS()+
				"\nCPU Type: "+getCPU()+
				"\nRAM Capacity: "+getRAM()+" GB"+
				"\nHDD Capacity: "+getHDD()+" GB"+
				"\nBox Color: "+getBoxColor()
				);
		
	}


}
