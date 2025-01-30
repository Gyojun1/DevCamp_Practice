package me.Gyojun.practice.practice_1.Tree;

public class BinaryTree {

    private TreeNode root;

    public TreeNode makeBinTree(TreeNode rootNode){
        root = rootNode;
        root.left = null;
        root.right = null;

        return root;
    }
    public TreeNode insertLeftChildNodeBT(TreeNode parentNode, TreeNode element){
        if(parentNode != null && parentNode.left == null){
            parentNode.left= element;
            parentNode.left.left=null;
            parentNode.left.right=null;

            return parentNode.left;
        }
        else return null;
    }



    public TreeNode insertRightChildNodeBT(TreeNode parentNode, TreeNode element){
        if(parentNode != null && parentNode.right == null){
            parentNode.right= element;
            parentNode.right.left=null;
            parentNode.right.right=null;


            return parentNode.left;
        }
        else return null;
    }



    


}
