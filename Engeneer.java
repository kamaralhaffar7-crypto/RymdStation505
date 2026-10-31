public class Engeneer extends TeamMembers{
    
    public Engeneer(String name){
        super(name);
    }
    @Override 
    public void repair(Station station){
         System.out.println("The section "+ station + " has been fixad !.");

    }

}