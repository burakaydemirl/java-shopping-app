
public class TV extends Electronic {
	
	int screenSize;

	public TV(String itemType,int ID, double price, int stock, String manu, String brand, int voltage, int maxWatt, int screenSize) {
		super(itemType,ID, price, stock, manu, brand, voltage, maxWatt);
		this.screenSize=screenSize;
	}

	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}
	public String toString(){
		return ("-----------------------\nType: "
				+ "TV\nItem ID: "+getID()+"\n"
				+ "Price: "+getPrice()+" $"+
				" \nManufacturer: : "
				+getManu()+"\n"+"Brand: "+getBrand()+
				"\nMax Volt: : "+getVoltage()+" V."+
				"\nMax Watt: "+getMaxWatt()+" W."+
				"\nScreen size: "+ getScreenSize()+"\""
				);
		
	}

}
