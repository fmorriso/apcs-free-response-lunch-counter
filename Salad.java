/**
 * Created by Fred on 4/20/2015.
 */
public class Salad implements MenuItem
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
	public Salad(String name, double price)
	{
		this.name = name;
		this.price = price;
	}
}
