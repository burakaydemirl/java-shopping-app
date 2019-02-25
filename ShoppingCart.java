
import java.util.concurrent.CopyOnWriteArrayList;

public class ShoppingCart {

	int ID;
	//ArrayList<Integer> shopList = new ArrayList<Integer>();
	CopyOnWriteArrayList<Integer> shopList =new CopyOnWriteArrayList<Integer>();
	public ShoppingCart(int ID,int itemID) {
		
		this.ID=ID;
		this.shopList.add(itemID);
		
	}

	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}


	public CopyOnWriteArrayList<Integer> getShopList() {
		return shopList;
	}


	public void setShopList(CopyOnWriteArrayList<Integer> shopList) {
		this.shopList = shopList;
	}


	

	
}
