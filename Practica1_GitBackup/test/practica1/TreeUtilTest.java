/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import material.Position;
import material.tree.narytree.LinkedTree;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jvelez
 */
public class TreeUtilTest {
    
    public TreeUtilTest() {
    }

    /**
     * Test of clone method, of class TreeUtil.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        
        LinkedTree <Integer> tree1 = new LinkedTree <>();
        Position<Integer> root = tree1.addRoot(3);
        Position<Integer> aux1 = tree1.add(1, root);
        Position<Integer> aux2 = tree1.add(5, root);
        Position<Integer> pos = tree1.add(7, aux2);

        LinkedTree <Integer> tree2 = new LinkedTree <>();

        TreeUtil.clone(tree1, tree2);
        
        assertEquals(3, tree2.root().getElement().intValue());
        
        StringBuilder expected1 = new StringBuilder();
        treeToString(tree1, expected1);

        StringBuilder expected2 = new StringBuilder();
        treeToString(tree2, expected2);
        
        assertEquals(expected1,expected2);
    }

    private void treeToString(LinkedTree<Integer> tree1, StringBuilder expected) {
        for (Position<Integer> i:tree1) {
            expected.append(i.getElement().intValue());
        }
    }

    /**
     * Test of rearranger method, of class TreeUtil.
     */
    @Test
    public void testRearranger() {
        System.out.println("rearranger");

        LinkedTree <Integer> tree = new LinkedTree <>();
        Position<Integer> root = tree.addRoot(3);
        Position<Integer> aux1 =tree.add(1, root);
        Position<Integer> aux2 = tree.add(5, root);
        Position<Integer> pos = tree.add(7, aux2);
        
        TreeUtil.rearranger(tree, pos);
        
        assertEquals(pos, tree.root());
        assertEquals(tree.parent(aux2), tree.root());
        assertEquals(tree.parent(tree.parent(root)), tree.root());
        assertEquals(tree.parent(tree.parent(tree.parent(aux1))), tree.root());
    }    
}
