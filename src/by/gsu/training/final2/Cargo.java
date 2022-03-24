package by.gsu.training.final2;

public class Cargo extends Wagon{
    private String type;
    private int maximumLoad;
    private int loaded;

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
}
