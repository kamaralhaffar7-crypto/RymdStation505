import java.lang.classfile.instruction.SwitchCase;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main (String [] args){
        Engeneer engeneer=new Engeneer("Max");
        Manager manager= new Manager(null);
        Energy energy= new Energy(100);
        Station station = null;
        Scanner input = new Scanner(System.in);
        boolean GAME_OVER= false;
        Station currentStation = Station.START;

        System.out.println("WELCOME TO RYMDSTATION!");
        System.out.println("----------------------");
        System.out.println("You are the manager who will save the station!");
        System.out.println("Enter your name: ");
        
        String name = input.nextLine();

        System.out.println("ROOL");
        System.out.println("-----------------------------");
        System.out.println("You will issue orders to the engineer to repair the sections.\nYour initial energy level is 100,\nand each incorrect choice will reduce it by 10 percent.\nThe station must be repaired in order!");
        System.out.println("-------------------------------");
        System.out.println("Are you ready!! Klick ENTER to start");
        String start;
        do{
            start= input.nextLine();
            if(! start.isBlank()){
                System.out.println("Invalid input! Press ENTER only.");
            }
        }
        
            while (! start.isBlank()); {
                 System.out.println("The mission start!\nNow yor are in the start Section!");
                 currentStation= Station.LUFTSLUSS;
                
            }

       while (!GAME_OVER) {
        System.out.println("Choce a number of section ");
        System.out.println("1-Luftsluss");
        System.out.println("2-Labb");
        System.out.println("3-Rektor");
        int choice= 0;        
    
        boolean validinput= false;

        while (!validinput) {
            
        
        
        try {
             choice = input.nextInt();
             validinput= true;

        } catch (InputMismatchException e) {
                    System.out.println("Indvid input! Enter numbers only");
                    input.nextLine();
        }
       }
        
            
        
        switch (choice) {
        case 1: 
            station=Station.LUFTSLUSS;
            
            break;

            case 2: 
            station= Station.LABB;
            
            break;

            case 3:
            station= Station.REAKTOR;
            
            break;
    
            default:

            System.out.println("Choise only 1,2 or 3!");
            continue;
            
            
            }
             if (station == currentStation){
                System.out.println("Your energy is:"+ energy.getEnergy());
                
                int power= 25;
                if(energy.getEnergy()>= power){
                    manager.repair(currentStation);
                    engeneer.repair(currentStation);
                    energy.changEnergy(power);
                    System.out.println("The task has been completed, go to next section");
                    System.out.println("Your energy now is "+energy.getEnergy() +"%");
                     System.out.println("----------------------------------------");
                    if(currentStation== Station.LUFTSLUSS){
                        currentStation=Station.LABB;
                    
                    }else if(currentStation==Station.LABB){
                        currentStation=Station.REAKTOR;
                    }else{
                         System.out.println("GOOD!!\nMission completed!!");
                         GAME_OVER= true;
                    }

                    

                    continue;

                    
                }else{
                    System.out.println("Your energy is not enough!" );
                     System.out.println("----------------------------------------");
                    break;
                }
            }else{
                    System.out.println("-A wrong choice\n-You have lost 20% of your energi");
                    energy.changEnergy(20);
                     System.out.println("-Your energy is:"+ energy.getEnergy());
                      
                    System.out.println("----------------------------------------");
            



            }
        }





        
        
        

        





    }
}