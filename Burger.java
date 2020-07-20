
public class Burger extends Part {
	private int fleischMenge;
	private double burgerPrice;
	private BurgerExtra[] burgerExtras=new BurgerExtra[0];
	
	public Burger() {
		this.fleischMenge=1;
	}
	
	public void increaseBurgerPrice(double delta) {
		this.burgerPrice=this.burgerPrice+delta;	
	}

	public void decreaseBurgerPrice(double delta) {
		this.burgerPrice=this.burgerPrice-delta;	
	}
	
	public double getBurgerPrice() {
		return this.burgerPrice;
	}
	
	public void addBurgerExtra(BurgerExtra burgerExtra) {
		BurgerExtra[] temp=new BurgerExtra[this.burgerExtras.length+1];
		for (int i=0;i<this.burgerExtras.length;i++) {
			temp[i]=this.burgerExtras[i];
		}
		temp[this.burgerExtras.length]=burgerExtra;
		this.burgerExtras=temp;
		this.increaseBurgerPrice(burgerExtra.getPartPrice());
	}
	
	public void addFleisch() {
		this.fleischMenge++;	
		this.increaseBurgerPrice(this.getPartPrice());
	}
	
	public void removeFleisch() {
		if (this.fleischMenge>=1) {
			this.fleischMenge--;
			this.decreaseBurgerPrice(this.getPartPrice());
		}
	}
	
	public void removeBurgerExtra(BurgerExtra burgerExtra) {
		BurgerExtra[] temp=new BurgerExtra[this.burgerExtras.length-1];
		int j=0;
		for (int i=0;i<this.burgerExtras.length;i++) {
			if (this.burgerExtras[i]!=burgerExtra) {
				temp[j]=this.burgerExtras[i];
				j++;
			}
		}
		this.burgerExtras=temp;
		this.decreaseBurgerPrice(burgerExtra.getPartPrice());
	}
	
}
