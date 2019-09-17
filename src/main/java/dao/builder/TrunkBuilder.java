package dao.builder;

import dao.Trunk;

public class TrunkBuilder {

    private int height;

    private int diameter;

    public TrunkBuilder(final int height, final int diameter) {
        this.height = height;
        this.diameter = diameter;
    }

    public Trunk build(){
        Trunk trunk = new Trunk(height, diameter);
        return trunk;
    }
}
