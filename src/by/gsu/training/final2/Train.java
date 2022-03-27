package by.gsu.training.final2;

public class Train {
    String type;
    Locomotive locomotive;
    Wagon[] composition;

    public Train(String type, Locomotive locomotive, Wagon[] arr){
        this.type = type;
        this.locomotive = locomotive;
        composition = arr;
    }

    public void addWagon(int yearOfIssue, String type, int cargo){
        if(this.type.equals("Пассажирский") && (type.equals("Сидячий") || type.equals("Плацкарт") ||
                type.equals("Купейный") || type.equals("СВ"))){
            composition[composition.length] = new Carriage(yearOfIssue, type, cargo);
        }else{
            composition[composition.length] = new Cargo(yearOfIssue, type, cargo);
        }
    }

    public Wagon getWagonN(int number){
        return this.composition[number];
    }

    public void changeWagonN(int numberOfWagon, int yearOfIssue, String type, int cargo){
        if(numberOfWagon < composition.length){
            if(this.type.equals("Пассажирский")){
                composition[numberOfWagon] = new Carriage(yearOfIssue, type, cargo);
            }else{
                composition[numberOfWagon] = new Cargo(yearOfIssue, type, cargo);
            }
        }else{
            addWagon(yearOfIssue, type, cargo);
        }
    }

    public String getType(){
        return type;
    }

    public void setLocomotive(Locomotive locomotive) {
        this.locomotive = locomotive;
    }

    public void print(){
        System.out.println("Поезд " + type + "\n" + locomotive.toString() + "\n");
        for(int i = 0; i < composition.length && composition[i] != null; i++){
            System.out.println(composition[i]);
        }
    }

    public int sumPassengers(){
        int result = 0;
        for(int i = 0; i < composition.length && composition[i] != null; i++){
            result += composition[i].countMassNetto();
        }
        return result;
    }

    public void sort(){
        for(int i = 0; i < composition.length && composition[i] != null; i++){
            for(int j = 0; j < composition.length && composition[j] != null; j++){
                if(composition[i].getNumberOfType() > composition[i].getNumberOfType()){
                    Wagon bufer = composition[i];
                    composition[i] = composition[j];
                    composition[j] = bufer;
                }
            }
        }
    }

}
