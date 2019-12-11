/**
 * Created by Fred Morrison on 4/20/2015.
 */
public class Trio implements MenuItem
{

	private String name;
	private double price;

	private Sandwich sandwich;
	private Salad salad;
	private Drink drink;

	public Trio(Sandwich sandwich, Salad salad, Drink drink)
	{
		this.sandwich = sandwich;
		this.salad = salad;
		this.drink = drink;
	}

	@Override
	public String getName()
	{
		return sandwich.getName() + "/ " + salad.getName() + "/ " + drink.getName() + " Trio";
	}

	@Override
	public double getPrice()
	{
		double total = 0;

		double t1 = sandwich.getPrice() + salad.getPrice();
		double t2 = sandwich.getPrice() + drink.getPrice();
		double t3 = salad.getPrice() + drink.getPrice();

		total = Math.max(t1, t2);
		total = Math.max(total, t3);

		return total;
	}
}
