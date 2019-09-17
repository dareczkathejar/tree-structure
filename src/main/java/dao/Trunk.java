package dao;

public class Trunk {

    private int height;

    private int diameter;

    public Trunk() {
    }

    public Trunk(int height, int diameter) {
        this.height = height;
        this.diameter = diameter;
    }

    public void grow(){
        this.setDiameter(this.getDiameter() + 10);
        this.setHeight(this.getHeight() + 50);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
}
