
public class Perfume extends Cosmetic {
	
	int lastDur;
	
	public Perfume(String itemType,int ID,int stock,double price,String manu,String brand,
			int organic,int ExpDate,int weight,int lastDur){
		super(itemType,ID,stock,price, manu, brand, organic, ExpDate, weight);
		this.lastDur=lastDur;

	}

	public int getLastDur() {
		return lastDur;
	}

	public void setLastDur(int lastDur) {
		this.lastDur = lastDur;
	}
	public String toString(){
		return ("-----------------------\nType: "
				+ "Perfume\nItem ID: "+getID()+"\n"
				+ "Price: "+getPrice()+" $"+
				" \nManufacturer: : "
				+getManu()+"\n"+"Brand: "+getBrand()+
				"\nOrganic: ")+(isOrganic()==1 ? "Yes" :"No")+
				"\nExpiration Date: "+getExpDate()+
				"\nWeight: "+getWeight()+" g."+
				"\nLasting Duration: "+ getLastDur()+" min.";
		
	}

}
