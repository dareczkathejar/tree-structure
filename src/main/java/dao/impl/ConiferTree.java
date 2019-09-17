package dao.impl;

import dao.Branch;
import dao.Needle;
import dao.Tree;
import dao.Trunk;

import java.util.ArrayList;
import java.util.List;

public class ConiferTree extends Tree {

    private List<Needle> needles;

    public ConiferTree(Trunk trunk, List<Branch> branches, List<Needle> needles) {
        super(trunk, branches);
        this.needles = needles;
    }

    @Override
    public void grow() {
        super.grow();
        this.needles.forEach(Needle::grow);
        updateNeedles();
    }

    private void updateNeedles(){
        List<Needle> newNeedles = new ArrayList();
        newNeedles.addAll(this.getNeedles());
        for (int i = 0; i < getBranches().size(); i++) {
            newNeedles.add(new Needle(2.5));
        }
        this.setNeedles(newNeedles);
    }

    public List<Needle> getNeedles() {
        return needles;
    }

    public void setNeedles(List<Needle> needles) {
        this.needles = needles;
    }
}
