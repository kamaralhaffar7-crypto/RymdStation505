import java.lang.classfile.instruction.SwitchCase;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main (String [] args){
        
        Engineer engineer=new Engineer("Max");
        Energy energy= new Energy(100);
        Station station = null;
        Scanner input = new Scanner(System.in);
        boolean GAME_OVER= false;
        Station currentStation = Station.START;
        
         
        System.out.println("WELCOME TO RYMDSTATION!");
        System.out.println("You are the manager who will save the station!");
        System.out.println("-----------------------------");
        System.out.println("Enter your name:"); 
        String name=input.nextLine();
        Manager manager= new Manager(name);
        Game game= new Game(manager, engineer,energy);
        System.out.println("The engineer -Max- will assist you wihe this task.");
        

        game.displayRolls();

        String start;
        do{
             start= input.nextLine();
            if(! start.isBlank()){
                System.out.println("Invalid input! Press ENTER only.");
            }
        }
        while (! start.isBlank()); {
            System.out.println("-------------------------------");
            System.out.println("The mission start!\nNow yor are in the start Section!");
        }

        game.showChoice();
        

        
        
       

        
        
            
        
            
        



        

        

        
    }
}