
public class Electronic extends Item {
	String manu;
	String brand;
	int voltage;
	int maxWatt;

	public Electronic(String itemType,int ID, double price, int stock,String manu,String brand,int voltage,int maxWatt) {
		super(itemType,ID, price, stock);
		this.manu=manu;
		this.brand=brand;
		this.voltage=voltage;
		this.maxWatt=maxWatt;
	
	}

	public String getManu() {
		return manu;
	}

	public void setManu(String manu) {
		this.manu = manu;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getVoltage() {
		return voltage;
	}

	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}

	public int getMaxWatt() {
		return maxWatt;
	}

	public void setMaxWatt(int maxWatt) {
		this.maxWatt = maxWatt;
	}
	

}
