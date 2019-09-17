package standalone;

import dao.TreeType;
import dao.factory.TreeFactory;
import dao.impl.ConiferTree;
import dao.impl.LeafyTree;

public class TreeApplication {

    public static void main(String[] args) {

        TreeFactory factory = new TreeFactory();
        LeafyTree leafyTree = (LeafyTree) factory.createTree(TreeType.LEAFY);
        ConiferTree coniferTree = (ConiferTree) factory.createTree(TreeType.CONIFER);

        leafyTree.grow();
        coniferTree.grow();
    }
}
