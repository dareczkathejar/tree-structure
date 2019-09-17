package dao;

public class Needle {

    private double size;

    public Needle() {
    }

    public Needle(double size) {
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
    }}
