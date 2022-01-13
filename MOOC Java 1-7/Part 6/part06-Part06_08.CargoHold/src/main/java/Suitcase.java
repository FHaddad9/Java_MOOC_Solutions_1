
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Feras
 */
public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item){
        if((totalWeight() + item.getWeight()) <= this.maxWeight){
            this.items.add(item);
        }
    }
    
    public void printItems(){
        for(Item str: this.items){
            System.out.println(str);
        }
    }
    
    public Item heaviestItem(){
        
        
        if(items.isEmpty()){
            return null;
        }
        
        Item heaviestItem = this.items.get(0);
        
        for(Item e: items){
            if(heaviestItem.getWeight() < e.getWeight()){
                heaviestItem = e;
            }
        }
        return heaviestItem;
    }
    
    public int totalWeight(){
        int weight = 0;
        for(Item e : items){
            weight += e.getWeight();
        }
        
        return weight;
    }
    
    public String toString(){
        String weight = " (" + totalWeight() + "kg)";
        String item = "";
        
        if(items.isEmpty()){
            item = "no items";
        } else if(items.size() == 1){
            item = "1 item";
        }
        else{
            item = items.size() + " items";
        }        
        
        return item + weight;
    }
}
