
public class CDDVD extends OfficeSupplies {
	
	String composer;
	String songs;

	public CDDVD(String itemType,int ID, double price, int stock, int releaseDate, String coverTitle,
			String composer,String songs) {
		super(itemType,ID, price, stock, releaseDate, coverTitle);
		this.composer=composer;
		this.songs=songs;

	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getSongs() {
		return songs;
	}

	public void setSongs(String songs) {
		this.songs = songs;
	}
	
	public String toString(){
		return ("-----------------------\nType: "
				+ "CDDVD\nItem ID: "+getID()+"\n"
				+ "Price: "+getPrice()+" $"+
				" \nRelease Date: "
				+getReleaseDate()+"\n"+"Title: "+getCoverTitle()+
				"\nSongs: "+getSongs()+
				"\nComposer: "+getComposer());
	}

}
