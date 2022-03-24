package by.gsu.training.final2;

public class Carriage extends Wagon {

    private String type;
    private int numberOfSeats;
    private int occupiedSeats;

    @Override
    public boolean loading(int count) {
        if(numberOfSeats - occupiedSeats > count){
            occupiedSeats += count;
            return true;
        }
        return false;
    }

    @Override
    public void unload() {
        occupiedSeats = 0;
    }
}
