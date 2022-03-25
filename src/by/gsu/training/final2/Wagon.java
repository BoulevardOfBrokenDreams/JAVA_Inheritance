package by.gsu.training.final2;

public abstract class Wagon {

    protected int mass;
    protected int yearOfIssue;

    public Wagon(int mass, int yearOfIssue){
        this.mass = mass;
        this.yearOfIssue = yearOfIssue;
    }

    public abstract boolean loading(int count);
    public abstract void unload();
}
