
public class Cosmetic extends Item {

	int ExpDate;
	int weight;
	int organic;
	String manu;
	String brand;
	
	public Cosmetic(String itemType,int ID,int stock,double price,String manu,String brand,
			int organic,int ExpDate,int weight) {
		
		super(itemType,ID, price, stock);
		this.manu=manu;
		this.brand=brand;
		this.organic=organic;
		this.ExpDate=ExpDate;
		this.weight=weight;
		
	}

	public int getExpDate() {
		return ExpDate;
	}

	public void setExpDate(int expDate) {
		ExpDate = expDate;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int isOrganic() {
		return organic;
	}

	public void setOrganic(int organic) {
		this.organic = organic;
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
	
}
