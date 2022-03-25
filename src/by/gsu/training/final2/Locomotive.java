package by.gsu.training.final2;

public class Locomotive extends Wagon{

    private int maximalSpeed;
    private int mileage;
    private int tankCapacity;
    private int tankLoad;

    public Locomotive(int mass, int yearOfIssue, int maximalSpeed, int mileage, int tankCapacity){
        super(mass, yearOfIssue);
        this.maximalSpeed = maximalSpeed;
        this.mileage = mileage;
        this.tankCapacity = tankCapacity;
    }

    @Override
    public boolean loading(int count) {
        if(tankCapacity - tankLoad > count){
            tankLoad += tankCapacity;
            return true;
        }
        return false;
    }

    @Override
    public void unload() {
        tankLoad = 0;
    }


}