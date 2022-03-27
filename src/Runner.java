import by.gsu.training.final2.*;

public class Runner {
    public static void main(String[] args) {

        Locomotive locomotive = new Locomotive(30,2003, 100, 100898, 1300);
        Wagon[] arr = new Carriage[15];

        arr[0] = new Carriage(2003, "Сидячий", 61);
        arr[1] = new Carriage(2012, "Купейный", 13);
        arr[2] = new Carriage(2018, "Плацкарт", 24);
        arr[3] = new Carriage(2004, "СВ", 1);
        arr[4] = new Carriage(1999, "Сидячий", 24);
        arr[5] = new Carriage(2015, "Сидячий", 43);
        arr[6] = new Carriage(2011, "Купейный", 31);
        arr[7] = new Carriage(2011, "Купейный", 30);
        arr[8] = new Carriage(2016, "СВ", 11);
        arr[9] = new Carriage(2020, "Плацкарт", 50);

        Train trainPas = new Train("Пассажирский", locomotive, arr);

        System.out.println(trainPas.getWagonN(3).toString());

        trainPas.changeWagonN(3, 2000, "Купейный", 13);

        System.out.println(trainPas.getWagonN(3).toString());

        trainPas.print();

        System.out.println("Масса всех пассажиров поезда равна " + trainPas.sumPassengers() + " кг");


    }
}
