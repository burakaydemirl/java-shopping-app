
public class Smartphone extends Electronic {
	
	String screenType;

	public Smartphone(String itemType,int ID, double price, int stock, String manu, String brand, int voltage, int maxWatt,String screenType) {
		super(itemType,ID, price, stock, manu, brand, voltage, maxWatt);
		this.screenType=screenType;
	}

	public String getScreenType() {
		return screenType;
	}

	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}
	public String toString(){
		return ("-----------------------\nType: "
				+ "SmartPhone\nItem ID: "+getID()+"\n"
				+ "Price: "+getPrice()+" $"+
				" \nManufacturer: : "
				+getManu()+"\n"+"Brand: "+getBrand()+
				"\nMax Volt: : "+getVoltage()+" V."+
				"\nMax Watt: "+getMaxWatt()+" W."+
				"\nScreen Type: "+ getScreenType()
				);
		
	}

}
