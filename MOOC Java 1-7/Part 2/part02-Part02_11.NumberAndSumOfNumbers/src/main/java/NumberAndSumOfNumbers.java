
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if(num == 0){
                break;
            }
            number = number + 1;
            sum = num + sum;
            
        }
        System.out.println("Number of numbers: "+number);
        System.out.println("Sum of the numbers: "+sum);
    }
}
