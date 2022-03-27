package by.gsu.training.final2;

public class Carriage extends Wagon {

    private String type;
    private  int numberOfSeats;
    private int occupiedSeats;
    private static String[] _types = {"Сидячий", "Плацкарт", "Купейный", "СВ"};

    public Carriage(int yearOfIssue, String type, int occupiedSeats){

        super(23, yearOfIssue);
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
        if(occupiedSeats < numberOfSeats){
            this.occupiedSeats = occupiedSeats;
        }else{
            this.occupiedSeats = 0;
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

    //по статистике средний человек при весе в 80-90 кг
    //возьмет с собой в поездку еще +-30 кг. отсюда цифра 110 :)
    @Override
    public int countMassNetto(){
        return occupiedSeats * 110;
    }

    @Override
    public int countMassBrutto(){
        return countMassNetto() + this.mass;
    }

    public String getType(){
        return type;
    }

    public int getNumberOfType(){
        for(int i = 0; i < _types.length; i++){
            if(this.type.equals(_types[i])){
                return i;
            }
        }
        return -1;
    }

}
