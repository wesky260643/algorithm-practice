package org.buaa.nlp.cj.baseAlgorithm.tree;

import org.buaa.nlp.cj.Utils.BiTreeNode;

/**
 * Created by whisky-yonk on 10/18/2015.
 */
public class CountLevelNodes {
    public static void main(String[] args) {
        BiTreeNode root = new BiTreeNode(1);
        root.lchild = new BiTreeNode(2);
        root.lchild.lchild = new BiTreeNode(4);
        root.lchild.rchild = new BiTreeNode(5);
        root.lchild.rchild.rchild = new BiTreeNode(9);
        root.lchild.lchild.lchild = new BiTreeNode(8);
        root.rchild = new BiTreeNode(3);
        root.rchild.lchild = new BiTreeNode(6);
        root.rchild.rchild = new BiTreeNode(7);
        root.rchild.rchild.lchild = new BiTreeNode(10);

        int nodesOflevel = nodeNumOf(root, 4);
        System.out.println(nodesOflevel);
    }

    public static int nodeNumOf(BiTreeNode root, int level) {
        if (level <= 0 || root == null) {
            return 0;
        } else if (level == 1) {
            return 1;
        } else {
            return nodeNumOf(root.lchild, level-1) + nodeNumOf(root.rchild, level-1);
        }
    }
}
