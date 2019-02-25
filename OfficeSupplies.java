
public class OfficeSupplies extends Item {
	
	int releaseDate;
	String coverTitle;

	public OfficeSupplies(String itemType,int ID, double price, int stock,
			int releaseDate,String coverTitle) {
		super(itemType,ID, price, stock);
		this.releaseDate=releaseDate;
		this.coverTitle=coverTitle;
		
	}

	public int getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getCoverTitle() {
		return coverTitle;
	}

	public void setCoverTitle(String coverTitle) {
		this.coverTitle = coverTitle;
	}

}
