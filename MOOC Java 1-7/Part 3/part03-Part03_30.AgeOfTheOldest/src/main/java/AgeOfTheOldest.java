
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age=0;
        int oldest=0;
        
        while(true){
            String text=scanner.nextLine();
            if(text.equals("")){
                break;
            }
            String[] pieces = text.split(",");
            for(int i=0; i<pieces.length; i++){
                if(age<Integer.valueOf(pieces[1])){
                    age=Integer.valueOf(pieces[1]);
                    oldest=age;
                }
            }
        }
        System.out.println("Age of the oldest: "+oldest);
    }
}
