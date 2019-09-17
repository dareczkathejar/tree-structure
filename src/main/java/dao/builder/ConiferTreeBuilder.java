package dao.builder;

import dao.Branch;
import dao.Needle;
import dao.Tree;
import dao.Trunk;
import dao.impl.ConiferTree;

import java.util.List;

public class ConiferTreeBuilder {

    private Trunk trunk;

    private List<Branch> branches;

    private List<Needle> needles;

    public ConiferTreeBuilder(final Trunk trunk, final List<Branch> branches) {
        this.trunk = trunk;
        this.branches = branches;
    }

    public ConiferTree build(){
        ConiferTree tree = new ConiferTree(trunk, branches, needles);
        return tree;
    }

    public ConiferTreeBuilder withNeedles (final List<Needle> needles){
        this.needles = needles;
        return this;
    }
}
