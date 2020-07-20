import java.util.Date;


public class Order {
	static int orderCount=1;
	private int orderID;
	private int orderTimer;
	private double orderPrice;
	private Menue[] menues=new Menue[0];

	
	public Order() {
		this.setOrderID(orderCount);
		orderCount++;
	}
	
	
	private void setOrderID(int orderID) {
		this.orderID=orderID;
	}
	public void setOrderTimer(int orderTime) {
		this.orderTimer=orderTime;
		/*
		 * https://www.java-blog-buch.de/12-01-zeit-in-java/
		 */
	}
	
	public int getOrderTime() {
		return this.orderTimer;
	}
	
	public double getOrderPrice() {
		return this.orderPrice;
	}
	
	public void addMenue(Menue menue) {
		
		Menue[] temp=new Menue[this.menues.length+1];
		for (int i=0;i<this.menues.length;i++) {
			temp[i]=this.menues[i];
		}
		temp[this.menues.length]=menue;
		this.menues=temp;
	}
	
	public void removeMenue(Menue menue) {
		Menue[] temp=new Menue[this.menues.length-1];
		int j=0;
		for (int i=0;i<this.menues.length;i++) {
			if (this.menues[i]!=menue) {
				temp[j]=this.menues[i];
				j++;
			}
		}
		this.menues=temp;
	}
}
