public class Energy{
    int energy;
    public Energy(int energy){
        this.energy= energy;
    }
    public int getEnergy(){
        return energy;
    }
    public int changEnergy(int power){
    energy -= power;
    return energy;

    }
    public int increasingEnergy(int more){
    energy += more;
    return energy;
    }
}