
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        if(this.squares > compared.squares){
            return true;
        } else{
            return false;
        }
    }
    
    public int priceDifference(Apartment compared){
        int res1 = this.squares * this.princePerSquare;
        int res2 = compared.squares * compared.princePerSquare;
        int diff = res1 - res2;
        
        if(diff >= 0){
            return diff;
        } 
        
        return -1 * diff;
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        int res1 = this.squares * this.princePerSquare;
        int res2 = compared.squares * compared.princePerSquare;
        
        if(res1 > res2){
            return true;
        }
        
        return false;
    }
}
