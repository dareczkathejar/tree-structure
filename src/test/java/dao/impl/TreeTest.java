package dao.impl;

import dao.TreeType;
import dao.factory.TreeFactory;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TreeTest {

    private LeafyTree leafyTree;
    private ConiferTree coniferTree;


    @Before
    public void setUp() throws Exception {
        leafyTree = (LeafyTree) TreeFactory.createTree(TreeType.LEAFY);
        coniferTree = (ConiferTree) TreeFactory.createTree(TreeType.CONIFER);
    }

    @Test
    public void growLeafyTree() {
        //given
        int initialTrunkHeight = leafyTree.getTrunk().getHeight();
        assertThat(leafyTree.getBranches().size(), is(1));
        assertThat(leafyTree.getLeaves().size(), is(1));
        //when
        leafyTree.grow();
        //then
        int finalTrunkHeight = leafyTree.getTrunk().getHeight();
        assertThat(finalTrunkHeight, is(initialTrunkHeight + 50));
        assertThat(leafyTree.getBranches().size(), is(2));
        assertThat(leafyTree.getLeaves().size(), is(3));
    }

    @Test
    public void growConiferTree() {
        //given
        int initialTrunkHeight = coniferTree.getTrunk().getHeight();
        assertThat(coniferTree.getBranches().size(), is(1));
        assertThat(coniferTree.getNeedles().size(), is(1));
        //when
        coniferTree.grow();
        //then
        int finalTrunkHeight = coniferTree.getTrunk().getHeight();
        assertThat(finalTrunkHeight, is(initialTrunkHeight + 50));
        assertThat(coniferTree.getBranches().size(), is(2));
        assertThat(coniferTree.getNeedles().size(), is(3));
    }
}