package dao;

public class Branch {

    private int length;

    private int thickness;

    public Branch() {
    }

    public Branch(int length, int thickness) {
        this.length = length;
        this.thickness = thickness;
    }

    public void grow(){
        this.setLength(this.getLength() + 5);
        this.setThickness(this.getThickness() + 1);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }
}
