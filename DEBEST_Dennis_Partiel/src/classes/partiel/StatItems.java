package classes.partiel;

import java.util.ArrayList;
import java.util.Collections;

public class StatItems {
	private ArrayList<StatItem> items;

	public StatItems() {
		
		this.items = new ArrayList<StatItem>();
	}
	
	public void addItem(char c){
		StatItem temp = new StatItem(c, 1);
		this.items.add(temp);
	}
	public int searchItem(char c){
		for(int i = 0; i < items.size(); i++){
			if(c == items.get(i).getC())
				return i;		
		}
		return -1;
	}
	
	public void gereItem(char c){
		if(searchItem(c)==-1){
			addItem(c);
		}
		else{
			items.get(searchItem(c)).incremente();
		}
	}
	
	public void trie(){
		int i = 0;
		while(i < items.size()-1){
			if (items.get(i).getNb() < items.get(i+1).getNb()){
				Collections.swap(items, i, i+1);
				if(i>0)
					i-=1;
			}
			else 
				i+=1;
		}
	}
	
	public String toString(){
		String start = "Collection de "+items.size()+" items \n";
		for(StatItem si : items){
			start += si.toString()+"\n";
		}
		return start;
		
	}
	
	
}
