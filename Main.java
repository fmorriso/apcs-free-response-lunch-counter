import java.text.NumberFormat;

// AP CS - 2014 - Free Response - Lunch Counter
public class Main
{

	public static void main(String[] args)
	{

		NumberFormat money = NumberFormat.getCurrencyInstance();

		Sandwich cheeseburger = new Sandwich("Cheeseburger", 2.75);
		Salad spinach = new Salad("Spinach Salad", 1.25);
		Drink orange = new Drink("Orange Soda", 1.10);

		Trio combo1 = new Trio(cheeseburger, spinach, orange);
		System.out.println(combo1.getName() + ", Price: " + money.format(combo1.getPrice()));

		Sandwich club = new Sandwich("Club Sandwich", 2.75);
		Salad coleslaw = new Salad("Coleslaw", 2.5);
		Drink cappuccino = new Drink("Cappuccino", 3.5);

		Trio combo2 = new Trio(club, coleslaw, cappuccino);
		System.out.println(combo2.getName() + ", Price: " + money.format(combo2.getPrice()));

	}
}
