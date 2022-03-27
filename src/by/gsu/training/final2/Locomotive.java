package by.gsu.training.final2;

public class Locomotive extends Wagon{

    private final int maximalSpeed;
    private final int mileage;
    private final int tankCapacity;
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

    @Override
    public String toString() {
        return "Локомотив" +
                "\n\tМаксимальная скорость = " + maximalSpeed +
                "\n\tПробег = " + mileage +
                "\n\tВместимость бака = " + tankCapacity +
                "\n\tБак заполнен = " + tankLoad +
                "\n\tмасса = " + mass +
                "\n\tВыпущен в" + yearOfIssue;
    }
    @Override
    public int countMassNetto(){
        return tankLoad;
    }

    @Override
    public int countMassBrutto(){
        return countMassNetto() + this.mass;
    }
}