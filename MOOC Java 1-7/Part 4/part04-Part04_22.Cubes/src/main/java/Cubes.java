
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String cube = scanner.nextLine();
            if(cube.equals("end")){
                break;
            }
            
            int number = Integer.valueOf(cube);
            number=number*number*number;
            System.out.println(number);
        }
    }
}
