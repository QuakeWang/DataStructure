package com.quake.avl;

/**
 * @author AKA二夕
 * @create 2020-12-02 16:08
 */
public class AVLTreeDemo {
}

// 创建Node类表示结点
class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

    // 添加结点
    public void add(Node node) {
        if (node == null) {
            return;
        }
        // 判断传入结点的值和当前子树根结点值的关系
        if (node.value < this.value) {
            // 如果当前结点的左子结点为null
            if (this.left == null) {
                this.left = node;
            } else {
                // 递归的向左子树添加
                this.left.add(node);
            }
        } else {// 传入结点的值大于当前结点
            if (this.right == null) {
                this.right = node;
            } else {
                // 递归的向右子树添加
                this.right.add(node);
            }
        }
    }
}
