import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class BinaryTreeNode {
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;
    BinaryTreeNode(int data){
        this.data=data;
    }
}
public class BinarySearchTree {
    public static int maximum(BinaryTreeNode root) {
        if (root==null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data,Math.max(maximum(root.left), maximum(root.right)));
    }
    public static int minimum(BinaryTreeNode root) {
        if (root==null) {
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));
    }
    public static boolean isBST(BinaryTreeNode root) {
        if (root==null) {
            return true;
        }
        int leftMax=maximum(root.left);
        int rightMin=minimum(root.right);
        if (leftMax>root.data) {
            return false;
        }
        if (rightMin<root.data) {
            return false;
        }
        return isBST(root.left)&&isBST(root.right);
    }

    public static BinaryTreeNode inputLevelWise() {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter root data:");
        int rootData=sc.nextInt();
        if (rootData==-1) {
            return null;
        }
        BinaryTreeNode root=new BinaryTreeNode(rootData);
        Queue<BinaryTreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode current=queue.poll();
            System.out.print("enter left child of "+current.data+":");
            int leftData=sc.nextInt();
            if (leftData!=-1) {
                BinaryTreeNode leftChild=new BinaryTreeNode(leftData);
                current.left=leftChild;
                queue.offer(leftChild);
            }
            System.out.print("enter right child of "+current.data+":");
            int rightData=sc.nextInt();
            if (rightData!=-1) {
                BinaryTreeNode rightChild=new BinaryTreeNode(rightData);
                current.right=rightChild;
                queue.offer(rightChild);
            }
        }
        return root;
    }

    public static void main(String[] args){
        BinaryTreeNode root=inputLevelWise();
        boolean ans=isBST(root);
        System.out.println(ans);
    }
}
