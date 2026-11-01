import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
  private Manager manager;
  private Engineer engineer;
  private Energy energy;
  public Game(Manager manager, Engineer engineer, Energy energy){
    this.manager= manager;
    this.engineer= engineer;
    this.energy=energy;

  }
  Scanner input= new Scanner(System.in);
  Station station ;
  boolean GAME_OVER= false;
  
 Station currentStation=Station.LUFTSLUSS;
  public void displayRolls(){
    System.out.println("-------------------------------");
    System.out.println("ROLLs");
    System.out.println("You will issue orders to the engineer to repair the sections.\nYour initial energy level is 100,\nand each incorrect choice will reduce it by 20 percent.\nThe station must be repaired in order!");
    System.out.println("-------------------------------");
    System.out.println("Are you ready!! Klick ENTER to start");
  }
  
  public void showChoice(){
    while (!GAME_OVER) {
       System.out.println("Choce a number of section ");
       System.out.println("1-Luftsluss");
       System.out.println("2-Labb");
       System.out.println("3-Rektor");

       int choice=0;
       boolean validChoice=false;

       while (!validChoice) {
        
       
       try {
        choice= input.nextInt();
        validChoice=true;
        
        
       } catch (InputMismatchException e) {
         System.out.println("Enter only numbers!");
         input.nextLine();
       }
      }

       switch (choice) {
        case 1:
         station= Station.LUFTSLUSS;
          
          break;

           case 2:
          station=Station.LABB;
          
          break;

           case 3:
          station=Station.REAKTOR;
          
          break;
       
        default:
          System.out.println("Invalid choice!, Enter only 1, 2, or 3");
          continue;
     }
        
    
    if(energy.getEnergy()>= 25){
      if(station==currentStation){
        System.out.println("----------------------");
        manager.moveToStation(currentStation);
        engineer.moveToStation(currentStation);
        manager.repair(currentStation);
        System.out.println("... 3,2,1");
        engineer.repair(currentStation);
        energy.changEnergy(25);
        System.out.println("The task has been completed.");
        
        if(currentStation ==Station.LUFTSLUSS){
          currentStation =Station.LABB;


        }else if(currentStation ==Station.LABB){
          currentStation =Station.REAKTOR;
        }else{
         System.out.println("GOOD!!\nMission completed!!");
         GAME_OVER= true;

        }

      }
      else{
       System.out.println("-A wrong choice\nYou have lost 20% of your energi");
       energy.changEnergy(20);
       System.out.println("Your energy is:"+ energy.getEnergy());


      }

    }

    else{
      System.out.println("YOU LOST \nYou do not have enough energy!");
      GAME_OVER=true;
      

    }
  }
}
}
  

  















    
       