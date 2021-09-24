
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here. 
        System.out.println("Enter the first sstring:");
        String same1 = scan.nextLine();
        System.out.println("Enter the second string:");
        String same2 = scan.nextLine();
        if(same1.equals(same2)){
            System.out.println("Same");
        } else{
            System.out.println("Different");
        }
    }
}
