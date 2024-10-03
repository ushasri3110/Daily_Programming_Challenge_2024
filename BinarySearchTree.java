import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BinaryTreeNode {
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    BinaryTreeNode(int data) {
        this.data = data;
    }
}

public class BinarySearchTree {
    
    public static boolean isBST(BinaryTreeNode root, Integer minValue, Integer maxValue) {
        if (root == null) {
            return true;
        }
        if ((minValue != null && root.data <= minValue) || 
            (maxValue != null && root.data >= maxValue)) {
            return false;
        }
    
        return isBST(root.left, minValue, root.data) &&
               isBST(root.right, root.data, maxValue);
    }

    public static boolean isBST(BinaryTreeNode root) {
        return isBST(root, null, null);
    }

    public static BinaryTreeNode inputLevelWise() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter root data: ");
        int rootData = sc.nextInt();
        if (rootData == -1) {
            return null;
        }
        BinaryTreeNode root = new BinaryTreeNode(rootData);
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode current = queue.poll();
            System.out.print("Enter left child of " + current.data + ": ");
            int leftData = sc.nextInt();
            if (leftData != -1) {
                BinaryTreeNode leftChild = new BinaryTreeNode(leftData);
                current.left = leftChild;
                queue.offer(leftChild);
            }
            System.out.print("Enter right child of " + current.data + ": ");
            int rightData = sc.nextInt();
            if (rightData != -1) {
                BinaryTreeNode rightChild = new BinaryTreeNode(rightData);
                current.right = rightChild;
                queue.offer(rightChild);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        BinaryTreeNode root = inputLevelWise();
        boolean ans = isBST(root);
        System.out.println("Is the tree a BST? " + ans);
    }
}
