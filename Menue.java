
public class Menue {
	private double menuePrice;
	public Burger burger;
	public Drink drink;
	private MenueExtra menueExtra;
		
	public void addBurger(Burger burger) {
		this.burger=burger;
		this.burger.increaseBurgerPrice(burger.getPartPrice());
		
	}
	
	public void addDrink(Drink drink) {
		this.drink=drink;
		this.drink.increaseDrinkPrice(drink.getPartPrice());
	}
	
	public void addMenueExtra(MenueExtra menueExtra) {
		this.menueExtra=menueExtra;
	}
	
	public double getMenuePrice() {
		double price=this.burger.getBurgerPrice()+this.drink.getDrinkPrice()+this.menueExtra.getPartPrice();
		return price;
	}
}
/*
 * Kontrolle ob immer ein Burger dabei ist, sonst Fehlermeldung
 */
