package dao.impl;

import dao.Branch;
import dao.Leaf;
import dao.Tree;
import dao.Trunk;

import java.util.ArrayList;
import java.util.List;

public class LeafyTree extends Tree {

    private List<Leaf> leaves;

    public LeafyTree(Trunk trunk, List<Branch> branches, List<Leaf> leaves) {
        super(trunk, branches);
        this.leaves = leaves;
    }

    @Override
    public void grow() {
        super.grow();
        this.leaves.forEach(Leaf::grow);
        updateLeaves();
    }

    private void updateLeaves(){
        List<Leaf> newLeaves = new ArrayList();
        newLeaves.addAll(this.getLeaves());
        for (int i = 0; i < getBranches().size(); i++) {
            newLeaves.add(new Leaf(2.5));
        }
        this.setLeaves(newLeaves);
    }

    public List<Leaf> getLeaves() {
        return leaves;
    }

    public void setLeaves(List<Leaf> leaves) {
        this.leaves = leaves;
    }
}
