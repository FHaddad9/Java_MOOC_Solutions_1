
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
public class UserInterface {
    private TodoList todolist;
    private Scanner scanner;
    
    public UserInterface(TodoList todolist, Scanner scanner){
        this.todolist = todolist;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String word = scanner.nextLine();
            
            if(word.equals("stop")){
                break;
            } else if(word.equals("add")){
                System.out.print("To add: ");
                String add = scanner.nextLine();
                todolist.add(add);
            } else if(word.equals("list")){
                todolist.print();
            } else if(word.equals("remove")){
                System.out.print("Which one is removed? ");
                Integer num = scanner.nextInt();
                todolist.remove(num);
            }
        }
    }
}
