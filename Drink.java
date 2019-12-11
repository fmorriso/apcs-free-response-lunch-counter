/**
 * Created by Fred on 4/20/2015.
 */
public class Drink implements MenuItem
{

	private String name;
	private double price;

	@Override
	public String getName()
	{
		return this.name;
	}

	@Override
	public double getPrice()
	{
		return this.price;
	}

	public Drink(String name, double price)
	{
		this.name = name;
		this.price = price;
	}
}
