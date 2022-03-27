package by.gsu.training.final2;

public class Cargo extends Wagon{

    private final int maximumLoad;
    private int loaded;
    private static final String[] _types = {"Цистерна", "Грузовой"};

    public Cargo(int yearOfIssue, String type, int loaded){

        super(29, yearOfIssue);
        this.type = type;

        if(type.equals("Цистерна")) {
            maximumLoad = 54;

        }else{
            maximumLoad = 68;
        }

        if(loaded < maximumLoad){
            this.loaded = loaded;
        }else{
            this.loaded = 0;
        }
    }

    @Override
    public boolean loading(int count) {
        if(count < maximumLoad - loaded){
            loaded += count;
            return true;
        }
        return false;
    }

    @Override
    public void unload() {
        loaded = 0;
    }

    @Override
    public String toString() {
        return "Тип вагона: " + type + "\nКоличество места (кг): " + maximumLoad + "\nЗанято: " + loaded;
    }

    @Override
    public int countMassNetto(){
        return loaded;
    }

    @Override
    public int countMassBrutto(){
        return countMassNetto() + this.mass;
    }

    @Override
    public int getNumberOfType(){
        for(int i = 0; i < _types.length; i++){
            if(this.type.equals(_types[i])){
                return i;
            }
        }
        return -1;
    }
}
