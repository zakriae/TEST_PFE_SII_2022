package sii.maroc;

import java.util.HashMap;
import java.util.Map;

public class Meal {
	
	private Ticket ticket;

	public int servedDishes() {
		
		int  numberServedDishes=0;
		HashMap<String,Integer> dishes = ticket.getMealDishes();
		for(Map.Entry<String, Integer> dish : dishes.entrySet()) {
			numberServedDishes+=dish.getValue();
		}
		
		// TODO Auto-generated method stub
		return numberServedDishes;
	}

	public int cookingDuration() {
		// TODO Auto-generated method stub
		return 0;
	}

}
