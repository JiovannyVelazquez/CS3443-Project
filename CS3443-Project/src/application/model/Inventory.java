package application.model;

import java.util.ArrayList;

public class Inventory {
	private ArrayList<Items> itemList;	
	
	public Inventory()
	{
		itemList = new ArrayList<Items>();
	}
	
	public void addItem(Items item){
		itemList.add(item);
	}
	
	public void removeItem(Items item){
		itemList.remove(item);
	}
}
