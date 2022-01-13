
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Feras
 */
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String word = scanner.nextLine();

            if(word.contains("end")){
                System.out.println("Bye bye!");
                break;
            } else if(word.contains("add")){
                System.out.print("Word: ");
                String words = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                dictionary.add(words, translation);
            } else if(word.contains("search")){
                System.out.print("To be translated: ");
                String search = scanner.nextLine();
                if(dictionary.translate(search) == null){
                    System.out.println("Word " + search + " was not found");
                } else{
                    System.out.println("Translation: " + dictionary.translate(search));
                }
            } else{
                System.out.println("Unknown command");
            }
        }
    }
}
