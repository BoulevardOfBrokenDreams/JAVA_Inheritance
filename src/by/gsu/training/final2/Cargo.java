package by.gsu.training.final2;

public class Cargo extends Wagon{
    private String type;
    private int maximumLoad;
    private int loaded;

    public Cargo(int yearOfIssue, String type, int loaded){

        super(29, yearOfIssue);
        this.type = type;

        switch (type){
            case "Цистерна":
                maximumLoad = 54;
                break;
            default:
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

    public int countMassNetto(){
        return loaded * 110;
    }

    public int countMassBrutto(){
        return countMassNetto() + this.mass;
    }


}
