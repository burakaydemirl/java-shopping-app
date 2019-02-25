
public class SkinCare extends Cosmetic{

	int babySens;
	int weight;
	
	public SkinCare(String itemType,int ID,int stock,double price,String manu,String brand,
			int organic,int ExpDate,int weight,int babySens) {
		super(itemType,ID,stock,price, manu, brand, organic, ExpDate, weight);
		this.babySens = babySens;
		
	}

	public int isBabySens() {
		return babySens;
	}

	public void setBabySens(int babySens) {
		this.babySens = babySens;
	}
	public String toString(){
		return ("-----------------------\nType: "
				+ "SkinCare\nItem ID: "+getID()+"\n"
				+ "Price: "+getPrice()+" $"+
				" \nManufacturer: : "
				+getManu()+"\n"+"Brand: "+getBrand()+
				"\nOrganic: ")+(isOrganic()==1 ? "Yes" :"No")+(
				"\nExpiration Date: "+getExpDate()+
				"\nWeight: "+getWeight()+" g."+
				"\nBaby Sensitive: ")+ (isBabySens()==1 ? "Yes" :"No"
				);
		
	}

}
