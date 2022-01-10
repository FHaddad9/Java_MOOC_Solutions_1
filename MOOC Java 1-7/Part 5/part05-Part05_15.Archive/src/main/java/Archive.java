/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Feras
 */
public class Archive {
    private String name;
    private String id;
    
    public Archive(String id, String name){
        this.name = name;
        this.id = id;
    }
    
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        if(!(compared instanceof Archive)){
            return false;
        }
        
        Archive comparedArchive = (Archive) compared;
        
        if(this.name.equals(comparedArchive.name)){
            return true;
        }
        return false;
    }
    
    public String toString(){
        return this.id + ": " + this.name;
    }
}
