
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> numbers = new ArrayList<>();
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == 9999){
                break;
            }
            numbers.add(input);
        }
        
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int check=numbers.get(0);
        int index=0;
        for(int i=0; i<numbers.size(); i++){
            int smallest=numbers.get(i);
            if(smallest<check){
                check=smallest;
                index=i;
            }
        }
        System.out.println("Smallest number: "+check);
        for(int i=0; i<numbers.size(); i++){
            if(numbers.get(i)==check){
                System.out.println(check+" is at index "+i);
            }
        }
        
    }
}
