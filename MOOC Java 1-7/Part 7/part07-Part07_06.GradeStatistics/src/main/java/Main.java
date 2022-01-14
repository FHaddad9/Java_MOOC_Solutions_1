
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        cubes();
    }
    
    public static void cubes(){
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            if(scanner.nextLine().equals("end")){
                break;
            }
            
            int cube = scanner.nextInt();
            System.out.println(cube * cube * cube);
        }
    }
    
    public static void average(){
        
        Scanner scanner = new Scanner(System.in);
    }
}
