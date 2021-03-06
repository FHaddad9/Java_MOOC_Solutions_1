
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check=false;
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        try(Scanner scan = new Scanner(Paths.get(file))){
            while(scan.hasNextLine()){
                String row = scan.nextLine();
                if(row.contains(searchedFor)==true){
                    check = true;
                }
                
            }
        } catch(Exception e){
            System.out.println("Reading the file "+e.getMessage()+" failed");
        }

        if(check==true){
            System.out.println("Found!");
        } else{
            System.out.println("Not Found.");
        }

    }
}
