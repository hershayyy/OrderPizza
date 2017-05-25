/******************************************************************************
* A Pizza object simulates a pizza entity, which allows you to control
* the pizza's size, and toppings.
* 
*
* @author Joshua Yurche
*   <A HREF="mailto:jry2@hood.edu"> (jry2@hood.edu) </A>
*
* @version
*   Jan 29, 2015
******************************************************************************/
import java.util.*;

public class Pizza
{
	Scanner keyboard = new Scanner(System.in);
	private String size;          // The size options for the pizza
	private String pizzaSize;     // The size of the pizza
	private int toppingAmount;  // The number of toppings on the pizza
	private String toppings;    // The type of toppings on the pizza
	
	/**
	* Construct a Pizza with a specified size and number of toppings
	* 
	* @param size, toppings
	*   The different sizes for the pizza, (s,m,l,xl) and different types
	*   of toppings
	* @precondition
	*   size = S else size = M else size = L else size = XL
	*   toppings = Pepperoni else toppings = sausage else ... toppings =
	*   anchovies
	*   0 > toppingAmount <= 8
	* @postcondition
	*   This Pizza has been initialized with the specified
	*   number 
	* @exception IllegalArgumentException
	*   Indicates that invalid entry was made.
	**/
	//Default Constructor
	public Pizza()
	{
		pizzaSize = "L";
		toppingAmount = 0;
		toppings = "Cheese";
	}
	
	/**Constructor with parameter
	public Pizza(String size) 
	{
		if(!size.equalsIgnoreCase("s") || !size.equalsIgnoreCase("m") || 
			!size.equalsIgnoreCase("l") || !size.equalsIgnoreCase("xl"))
		throw new IllegalArgumentException("Invalid size was entered: " + size);
		pizzaSize = size;
	}
	
	
	public Pizza(int numberOfToppings)
	{
		if((!numberOfToppings > 0) && (numberOfToppings <= 7))
		{
			System.out.println("This is an invalid entry, please choose between one and seven toppings.");
			System.exit(0);
		}
		else
		{
			toppingAmount = numberOfToppings;
		}
	}
	
	**/
			
	public void setSize()
	{
		if(!size.equalsIgnoreCase("s") || !size.equalsIgnoreCase("m") || 
			!size.equalsIgnoreCase("l") || !size.equalsIgnoreCase("xl"))
		throw new IllegalArgumentException("Invalid size was entered: " + size);
		pizzaSize = size;
	}
	
	public void setToppingAmount(int numberOfToppings)
	{
		{
		if((numberOfToppings > 0) && (numberOfToppings <= 7))
		{
			toppingAmount = numberOfToppings;
		}
		else
		{
			System.out.println("This is an invalid entry, please choose between one and seven toppings.");
			System.exit(0);
		}
	}
	}
	
	public void setToppings()
	{
		for(int i=1; i < toppingAmount; i++)
		{
			Scanner keyboard = new Scanner(System.in);
			toppings = keyboard.nextString();
			
				while (!toppings.equalsIgnoreCase("pepperoni") || !toppings.equalsIgnoreCase("sausage") || !toppings.equalsIgnoreCase("anchovies") 
					|| !toppings.equalsIgnoreCase("bacon") || !toppings.equalsIgnoreCase("ham") || !toppings.equalsIgnoreCase("jalapenos") 
					|| !toppings.equalsIgnoreCase("green peppers"))
				{
					System.out.println("The topping you entered does not exist, or has been misspelled.  Please check spelling and re-enter topping.");
					toppings = keyboard.nextString();
				}
			String nextTopping = toppings;
			
			System.out.println("Topping number " + i + ": " + nextTopping);
		}
	}
	
	//Accessor methods
	public String getPizzaSize()
	{
		return pizzaSize;	
	}
	
	public int getToppingAmount()
	{
		return toppingAmount;
	}
	
	public String getToppings()
	{
		return toppings;
	}
	
	//Methods
	public void readInput()
	{
       		Scanner keyboard = new Scanner(System.in);
		System.out.println("Choose your pizza size (S,M,L,XL)");
		size = keyboard.nextString();
		this.setSize(size);                       

                   	System.out.println("How many toppings would you like (up to 7)?");
		numberOfToppings = keyboard.nextInt();
		this.setNumberOfToppings(toppingAmount);
                       
		System.out.println("Choose between the following toppings:");
		System.out.println("Pepperoni");
		System.out.println("Sausage");
		System.out.println("Bacon");
		System.out.println("Ham");
		System.out.println("Green Peppers");
		System.out.println("Anchovies");
		System.out.println("Jalapenos");
		toppings = keyboard.nextString();
		this.setToppings(toppings);
	}
	
	
	
	
	//Equals
	private boolean equals (Pizza otherPizza)
	{
		return ((this.Pizza == otherPizza));
	}
	
	public void display()
	{
		System.out.println("********************************");
           	System.out.println("*         PIZZA  ORDER         *");
           	System.out.println("********************************");
		System.out.println( pizzaSize + " : " + toppingAmount + " : " + topping);
	}
}


