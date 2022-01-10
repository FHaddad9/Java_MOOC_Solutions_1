
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String text=scanner.nextLine();
            
            if(text.equals("")){
                break;
            }
            String[] pieces=text.split(",");
            for (int i=0; i<pieces.length; i++) {
                System.out.println(pieces);
            }
        }

    }
}
