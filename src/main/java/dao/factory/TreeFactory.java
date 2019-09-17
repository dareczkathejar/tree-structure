package dao.factory;

import dao.Leaf;
import dao.Needle;
import dao.Tree;
import dao.TreeType;
import dao.builder.BranchBuilder;
import dao.builder.ConiferTreeBuilder;
import dao.builder.LeafyTreeBuilder;
import dao.builder.TrunkBuilder;


import java.util.Collections;

public class TreeFactory {

    public static Tree createTree(TreeType type) {
        if (type.name().equals("LEAFY")) {
            return new LeafyTreeBuilder(
                    new TrunkBuilder(100, 25).build(),
                    Collections.singletonList(new BranchBuilder(50, 5).build()))
                    .withLeaves(Collections.singletonList(new Leaf(2.5)))
                    .build();
        } else if (type.name().equals("CONIFER")) {
            return new ConiferTreeBuilder(
                    new TrunkBuilder(100, 25).build(),
                    Collections.singletonList(new BranchBuilder(50, 5).build()))
                    .withNeedles(Collections.singletonList(new Needle(2.5)))
                    .build();
        } else {
            throw new IllegalArgumentException("Unknown tree type." + type.toString());
        }
    }
}
