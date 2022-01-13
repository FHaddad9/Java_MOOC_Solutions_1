
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
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        if((suitcase.totalWeight() + suitcaseWeight()) <= maxWeight){
            this.suitcases.add(suitcase);
        }
    }
    
    public int suitcaseWeight(){
        int weight = 0;
        
        for(Suitcase e : suitcases){
            weight += e.totalWeight();
        }
        return weight;
    }
    
    public void printItems(){
        for(Suitcase str: this.suitcases){
            str.printItems();
        }
    }
    
    public String toString(){
        String weight = " (" + suitcaseWeight() + "kg)";
        String suitcase = "";
        
        if(suitcases.isEmpty()){
            suitcase = "no suitcases";
        } else if(suitcases.size() == 1){
            suitcase = "1 suitcase";
        }
        else{
            suitcase = suitcases.size() + " suitcases";
        }        
        
        return suitcase + weight;
    }
}
