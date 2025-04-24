import java.util.*;
public class Classwork{
        public static class TreeNode{
        int data;
        TreeNode left,right;
        TreeNode(int value){
            data=value;
            left=right=null;
        }
    }
    public static int height(TreeNode root){
        if(root==null)return 0;
        int leftheight=height(root.left);
        int rightheight=height(root.right);
        return Math.max(leftheight,rightheight)+1;
    }
	public static void main(String[] args) {
		TreeNode root=new TreeNode(10);
		root.left=new TreeNode(20);
		root.right=new TreeNode(30);
		root.left.left=new TreeNode(40);
		root.left.right=new TreeNode(50);
		System.out.print("height is:"+height(root));
	}
}