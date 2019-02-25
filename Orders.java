import java.util.Date;

public class Orders {
	
	Date orderDate;
	int cstID;
	double total;
	int itemNumber;
	
	public Orders(int cstID,Date orderDate,int itemNumber, double total){
		
		this.cstID=cstID;
		this.orderDate=orderDate;
		this.itemNumber=itemNumber;
		this.total=total;
		
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getCstID() {
		return cstID;
	}

	public void setCstID(int cstID) {
		this.cstID = cstID;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}
	
	
	public String toString(){
		return ("Order date: "+getOrderDate()+" Customer ID: "+getCstID()+" Total Cost: "+getTotal()+
				" Number of purchased items: "+getItemNumber());
		
	}
	

}
