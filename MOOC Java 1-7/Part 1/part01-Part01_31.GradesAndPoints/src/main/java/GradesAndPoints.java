
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int num = Integer.valueOf(scan.nextLine());
        if(num < 0){
            System.out.println("Impossible!");
        } else if(num <= 49) {
            System.out.println("failed");
        } else if(num <= 59) {
            System.out.println("1");
        } else if(num <= 69) {
            System.out.println("2");
        } else if(num <= 79) {
            System.out.println("3");
        } else if(num <= 89) {
            System.out.println("4");
        } else if(num <= 100) {
            System.out.println("5");
        } else{
            System.out.println("Incredible!");
        }
    }
}
