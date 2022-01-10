/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Feras3
 */
public class Timer {
    private ClockHand hundrethsOfSeconds;
    private ClockHand seconds;
    
    public Timer(){
        this.hundrethsOfSeconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    
    public void advance(){
        this.hundrethsOfSeconds.advance();
        
        if(this.hundrethsOfSeconds.value()==0){
            this.seconds.advance();
        }
    }
    
    public String toString(){
        return seconds+":"+hundrethsOfSeconds;
    }
    
    
}
