package by.gsu.training.final2;

public class Locomotive extends Wagon{

    private int maximalSpeed;
    private int mileage;
    private int tankCapacity;
    private int tankLoad;

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

    public Locomotive(){

    }
}
