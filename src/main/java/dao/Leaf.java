package dao;

public class Leaf {

    private double size;

    public Leaf() {
    }

    public Leaf(double size) {
        this.size = size;
    }

    public void grow(){
        this.size += 0.5;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }


}
