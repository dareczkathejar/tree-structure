package dao;

import java.util.ArrayList;
import java.util.List;

public abstract class Tree {

    private Trunk trunk;
    private List<Branch> branches;

    public Tree() {
    }

    public Tree(Trunk trunk, List<Branch> branches) {
        this.trunk = trunk;
        this.branches = branches;
    }

    public void grow(){
        this.trunk.grow();
        this.getBranches().forEach(Branch::grow);
        List<Branch> newBranches = new ArrayList<>();
        newBranches.addAll(this.getBranches());
        newBranches.add(new Branch(50,5));
        this.setBranches(newBranches);
    }

    public Trunk getTrunk() {
        return trunk;
    }

    public void setTrunk(Trunk trunk) {
        this.trunk = trunk;
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }
}
