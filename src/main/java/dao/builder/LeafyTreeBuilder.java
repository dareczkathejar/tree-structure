package dao.builder;

import dao.Branch;
import dao.Leaf;
import dao.Trunk;
import dao.impl.LeafyTree;

import java.util.List;

public class LeafyTreeBuilder {

    private Trunk trunk;

    private List<Branch> branches;

    private List<Leaf> leaves;

    public LeafyTreeBuilder(final Trunk trunk, final List<Branch> branches) {
        this.trunk = trunk;
        this.branches = branches;
    }

    public LeafyTree build(){
        LeafyTree tree = new LeafyTree(trunk, branches, leaves);
        return tree;
    }

    public LeafyTreeBuilder withLeaves(final List<Leaf> leaves){
        this.leaves = leaves;
        return this;
    }
}
