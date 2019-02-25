
public class Book extends OfficeSupplies {
	
	String publisher;
	String author;
	int NoPages;

	public Book(String itemType,int ID, double price, int stock, int releaseDate, String coverTitle,
			String publisher,String author,int NoPages) {
		super(itemType,ID, price, stock, releaseDate, coverTitle);
		this.publisher=publisher;
		this.author=author;
		this.NoPages=NoPages;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNoPages() {
		return NoPages;
	}

	public void setNoPages(int noPages) {
		NoPages = noPages;
	}
	
	public String toString(){
		return ("-----------------------\nType: "
				+ "Book\nItem ID: "+getID()+"\n"
				+ "Price: "+getPrice()+" $"+
				" \nRelease Date: "
				+getReleaseDate()+"\n"+"Title: "+getCoverTitle()+
				"\nPublisher: "+getPublisher()+
				"\nAuthor: "+getAuthor()+
				"\nPage: "+getNoPages()+" pages");
		
	}

}
