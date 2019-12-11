/**
 * Created by Fred Morrison on 4/20/2015.
 */
public class Trio implements MenuItem
{

	private Sandwich sandwich;
	private Salad salad;
	private Drink drink;

	public Trio(Sandwich san, Salad sal, Drink d)
	{
		sandwich = san;
		salad = sal;
		drink = d;
	}

	public String getName()
	{
		return sandwich.getName() + "/ " + salad.getName() + "/ " + drink.getName() + " Trio";
	}

	public double getPrice()
	{
		double total = 0;

		double t1 = sandwich.getPrice() + salad.getPrice();
		double t2 = sandwich.getPrice() + drink.getPrice();
		double t3 = salad.getPrice() + drink.getPrice();

		total = Math.max(t1, t2); // (sandwich + salad) vs. (sandwich + drink)
		total = Math.max(total, t3); // (salad + drink) vs. previous result

		return total;
	}
}
