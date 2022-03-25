package by.gsu.training.final2;

public class Carriage extends Wagon {

    private String type;
    private int numberOfSeats;
    private int occupiedSeats;

    public Carriage(int mass, int yearOfIssue, String type, int occupiedSeats){
        super(mass, yearOfIssue);
        this.type = type;
        switch (type){
            case "Сидячий":
                numberOfSeats = 66;
                break;
            case "Плацкарт":
                numberOfSeats = 54;
                break;
            case "Купейный":
                numberOfSeats = 36;
                break;
            default:
                numberOfSeats = 18;
                break;
        }
    }

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

    @Override
    public String toString() {
        return "Тип вагона: " + type + "\nКоличество мест: " + numberOfSeats + "\nЗанято: " + occupiedSeats;
    }


}
