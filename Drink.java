
public class Drink extends Part {
	private DrinkExtra drinkExtra;
	public double drinkPrice;
	
	
	public void increaseDrinkPrice(double delta) {
		this.drinkPrice=this.drinkPrice+delta;	
	}

	public void decreaseDrinkPrice(double delta) {
		this.drinkPrice=this.drinkPrice-delta;	
	}
	
	public double getDrinkPrice() {
		return this.drinkPrice;
	}
	public void addDrinkExtra(DrinkExtra drinkExtra) {
		this.drinkExtra=drinkExtra;
		this.increaseDrinkPrice(drinkExtra.getPartPrice());
	}
	
	public void removeDrinkExtra() {
		this.decreaseDrinkPrice(this.drinkExtra.getPartPrice());
		this.drinkExtra=null;
	}
}
