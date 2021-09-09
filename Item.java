public class Item {
	
	private String name;
	private double price;
	private String description;
	
	public Item()
	{
		
	}
	
	public Item(String name, double price, String description)
	{
		this.name = name;
		this.price = price;
		this.description = description;
	}
	
	
	//getters
	public String getName()
	{
		return this.name;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public String getDescription()
	{
		return this.description;
	}

}
