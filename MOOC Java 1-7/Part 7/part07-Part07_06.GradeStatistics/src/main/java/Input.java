
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Feras
 */
public class Input {
    
    private Scanner scan = new Scanner(System.in);
    
    public Input(){
        
    }
    
    public String getInput(){
        String word = scan.nextLine();
        
        return word;
    }
}
