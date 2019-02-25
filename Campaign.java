
public class Campaign {
	
	String itemType;
	String lastDate;
	int rate;
	
	public Campaign(String item,String lastDate,int rate){
		this.itemType=item;
		this.lastDate=lastDate;
		this.rate=rate;
	
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getLastDate() {
		return lastDate;
	}

	public void setLastDate(String lastDate) {
		this.lastDate = lastDate;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
	public String toString(){
		return getRate()+"% sale of "+
	getItemType()+" until "+getLastDate();
		
	}
	
}
