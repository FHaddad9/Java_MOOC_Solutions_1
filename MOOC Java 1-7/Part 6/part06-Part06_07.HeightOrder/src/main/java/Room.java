
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
public class Room {
    private ArrayList<Person> persons = new ArrayList<>();
    
    public void add(Person person){
        this.persons.add(person);
    }
    
    public boolean isEmpty(){
        return persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        return persons;
    }
    
    public Person shortest(){
        if(persons.isEmpty()){
            return null;
        }
        
        Person returnObject = this.persons.get(0);
        
        for(Person prsn: this.persons){
            if(returnObject.getHeight() > prsn.getHeight()){
                returnObject = prsn;
            }
        }
        
        return returnObject;
    }
    
    public Person take(){
        Person returnShortest = this.shortest();
        this.persons.remove(this.shortest());
        return returnShortest;
    }
}
