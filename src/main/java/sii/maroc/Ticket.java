package sii.maroc;

import java.util.HashMap;

public class Ticket {
	
	
	Integer  id;

	static Integer counter = 0;
	private HashMap<String,Integer>  mealDishes;
	 
	
	public Ticket(String meal)
	{
		this.id = counter++;
		mealDishes = new HashMap<String,Integer>();
		 
		addMealDishes(meal);
		
		
		
	}
	
	public void addMealDishes(String meal)
	{  
		String[] itemString =  meal.split(" ",2);
		
		Integer itemQuantity = Integer.valueOf(itemString[0]);
		String itemName = itemString[1];
		
		mealDishes.put(itemName,itemQuantity);
		
		
	}
	
	public HashMap<String,Integer> getMealDishes()
	{
		return  this.mealDishes;
	}

	public Ticket and(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
