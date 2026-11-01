
public class Engineer extends TeamMembers implements Repairable{
    
    public Engineer(String name){
        super(name);
    }
    @Override 
    public void repair(Station station){
         System.out.println(name +": The section "+ station + " has been fixad !.");

    }
    @Override 
    public void moveToStation(Station station){
        System.out.println(name +": The task is in progress.");

    }

}