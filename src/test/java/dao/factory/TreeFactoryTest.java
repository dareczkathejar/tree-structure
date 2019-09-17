package dao.factory;

import dao.Tree;
import dao.TreeType;
import dao.impl.ConiferTree;
import dao.impl.LeafyTree;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TreeFactoryTest {

    TreeFactory treeFactory;

    @Before
    public void setUp() throws Exception {
        treeFactory = new TreeFactory();
    }

    @Test
    public void createTree() {
        //given
        TreeType leafyType = TreeType.LEAFY;
        TreeType coniferType = TreeType.CONIFER;

        //when
        Tree leafyTree = treeFactory.createTree(leafyType);
        Tree coniferTree = treeFactory.createTree(coniferType);

        //then
        assertThat(leafyTree instanceof LeafyTree, is(true));
        assertThat(coniferTree instanceof ConiferTree, is(true));
    }


}