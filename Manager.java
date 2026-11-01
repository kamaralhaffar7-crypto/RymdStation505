

public class Manager extends TeamMembers implements Repairable{

    public Manager(String name){
        super(name);

    }
    Station station=Station.START;
    @Override 
    public void repair(Station station){
        System.out.println(name +": Good! proceed with the repairs. ");
    }
    @Override 
    public void moveToStation(Station station){
        System.out.println(name+": Go to the section"+ station +" station.");
    }
}