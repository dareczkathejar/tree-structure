package dao.builder;

import dao.Branch;

public class BranchBuilder {

    private int lenght;

    private int thickness;

    public BranchBuilder(final int lenght, final int thickness) {
        this.lenght = lenght;
        this.thickness = thickness;
    }

    public Branch build(){
        Branch branch = new Branch(lenght, thickness);
        return branch;
    }
}
