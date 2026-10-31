public class Manager extends TeamMembers{

    public Manager(String name){
        super(name);

    }
    @Override 
    public void repair(Station station){
        System.out.println("Go to the "+ station + " and try to fix it.");
    }
}