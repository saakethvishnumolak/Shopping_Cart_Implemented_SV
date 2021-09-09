
public class Application {

	public static void main(String[] args) {
		
		Item item1 = new Item("apple", 1.50, "healthy red fruit");
		Item item2 = new Item("onion", 2.50, "root vegetable");
		Item item3 = new Item("chicken breast", 10.00, "lean white meat");
		Item item4 = new Item("potato chips", 3.00, "light and easy snack");
		Item item5 = new Item("popcorn", 4.00, "easy snack");
		
		
		
		//Add
		ArrayBag2<Item> newBag = new ArrayBag2<Item>();
		newBag.add(item1);
		newBag.add(item2);
		newBag.add(item3);
		newBag.add(item4);
		newBag.add(item5);
		
		Object[] bagArray = newBag.toArray(); 
		for(int i = 0; i < bagArray.length; i++)
		{
			Item item = (Item) bagArray[i];
			System.out.println(item.getName() + ", $" + item.getPrice() + ", " + item.getDescription());
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		//removeLastItem
		newBag.removeLastItem();
		bagArray = newBag.toArray();
		for(int i = 0; i < bagArray.length; i++)
		{
			Item item = (Item) bagArray[i];
			System.out.println(item.getName() + ", $" + item.getPrice() + ", " + item.getDescription());
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		//remove
		newBag.remove(item3);
		bagArray = newBag.toArray();
		for(int i = 0; i < bagArray.length; i++)
		{
			Item item = (Item) bagArray[i];
			System.out.println(item.getName() + ", $" + item.getPrice() + ", " + item.getDescription());
		}
		
	}

}
