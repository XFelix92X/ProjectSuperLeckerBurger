
public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		/*
		 * Initiale Preise
		 */
		
		MenueExtra pommes=new MenueExtra();
		pommes.setPartName("Pommes");
		pommes.setPartPrice(1.5);
		
		DrinkExtra eis=new DrinkExtra();
		eis.setPartName("Eis");
		eis.setPartPrice(0);
		
		BurgerExtra kaese=new BurgerExtra();
		kaese.setPartName("Käse");
		kaese.setPartPrice(0.75);
		
		BurgerExtra ziege=new BurgerExtra();
		ziege.setPartName("Ziege");
		ziege.setPartPrice(0.75);
		
		BurgerExtra gouda=new BurgerExtra();
		gouda.setPartName("Gouda");
		gouda.setPartPrice(0.75);
		
		Drink cola=new Drink();
		cola.setPartName("Cola");
		cola.setPartPrice(1.75);
		
		Drink wasser=new Drink();
		wasser.setPartName("Wasser");
		wasser.setPartPrice(1.25);
		
		Burger rind=new Burger();
		rind.setPartName("Rindfleisch");
		rind.setPartPrice(2.5);
		
		Burger huhn=new Burger();
		huhn.setPartName("Hähnchen");
		huhn.setPartPrice(2.4);
		
		Burger veggi=new Burger();
		veggi.setPartName("Vegetarisch");
		veggi.setPartPrice(2.2);
		
		/*
		 * Test
		 */
		Order Kuschel=new Order();
		Menue Bla1=new Menue();
		Bla1.addBurger(veggi);
		Bla1.addBurger(huhn);
		Bla1.addMenueExtra(pommes);
		Bla1.burger.addBurgerExtra(gouda);
		Bla1.burger.addFleisch();
		Bla1.addDrink(wasser);
		Bla1.drink.addDrinkExtra(eis);
		Bla1.drink.removeDrinkExtra();
		Bla1.getMenuePrice();
		Kuschel.addMenue(Bla1);
	}

}
