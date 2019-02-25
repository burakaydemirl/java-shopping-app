
public class Item {
	/**
	 * @param ID = Every item has a ID
	 * @param price = Every item has a price
	 * @param stock = Every item's stock amount
	 * @param itemType = Type of item
	 */
	
	int ID=1;
	double price;
	int stock;
	String itemType;
	
	
	public Item(String itemType,int ID,double price,int stock){
		this.ID=ID;
		this.price=price;
		this.stock=stock;
		this.itemType=itemType;
		
	}
	/**
	 * 
	 * @return Item's ID.
	 */
	public int getID() {
		return ID;
	}
	/**
	 * 
	 * @return Setting ID.
	 */

	public void setID(int iD) {
		ID = iD;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	

}
