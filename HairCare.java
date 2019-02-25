
public class HairCare extends Cosmetic {
	
	int isMedicated;

	public HairCare(String itemType,int ID,int stock,double price,String manu,String brand,
			int organic,int ExpDate,int weight,int isMedicated) {
		super(itemType,ID,stock,price, manu, brand, organic, ExpDate, weight);
		this.isMedicated=isMedicated;
	}

	public int isMedicated() {
		return isMedicated;
	}

	public void setMedicated(int isMedicated) {
		this.isMedicated = isMedicated;
	}
	public String toString(){
		return ("-----------------------\nType: "
				+ "HairCare\nItem ID: "+getID()+"\n"
				+ "Price: "+getPrice()+" $"+
				" \nManufacturer: : "
				+getManu()+"\n"+"Brand: "+getBrand()+
				"\nOrganic: ")+(isOrganic()==1 ? "Yes" :"No")+(
				"\nExpiration Date: "+getExpDate()+
				"\nWeight: "+getWeight()+" g."+
				"\nMedicated: ")+ (isMedicated()==1 ? "Yes" :"No"
				);
		
	}

}
