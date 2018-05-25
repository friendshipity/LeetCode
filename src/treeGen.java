/**
 * Created by Administrator on 2017/2/14.
 */
public class treeGen {
    public static TreeNode gen(int[] num) {

        TreeNode root = new TreeNode(num[0]);
        root.left = new TreeNode(Integer.valueOf(num[1]));
        root.right = new TreeNode(Integer.valueOf(num[2]));
        root.left.left = new TreeNode(Integer.valueOf(num[3]));
        root.left.right = new TreeNode(Integer.valueOf(num[4]));
        root.right.left = new TreeNode(Integer.valueOf(num[5]));
        root.right.right = new TreeNode(Integer.valueOf(num[6]));
        return root;
    }
    public static TreeNode genManual(int[] num){
        TreeNode root = new TreeNode(num[0]);
        root.left = new TreeNode(Integer.valueOf(num[1]));
        root.right = new TreeNode(Integer.valueOf(num[2]));
        root.right.left = new TreeNode(Integer.valueOf(num[3]));
        root.right.right = new TreeNode(Integer.valueOf(num[4]));
        root.right.left.left = new TreeNode(Integer.valueOf(num[5]));
        root.right.left.right = new TreeNode(Integer.valueOf(num[6]));
        return root;
    }

    public static TreeNode genManual1(int[] num){
        TreeNode root = new TreeNode(num[0]);
        root.left = new TreeNode(Integer.valueOf(num[1]));
        root.right = new TreeNode(Integer.valueOf(num[2]));
        root.left.left = new TreeNode(Integer.valueOf(num[3]));
        root.left.right = new TreeNode(Integer.valueOf(num[4]));
        root.left.left.left = new TreeNode(Integer.valueOf(num[5]));
        root.left.left.right = new TreeNode(Integer.valueOf(num[6]));
        return root;
    }

    public static TreeNode genManual2(int[] num){
        TreeNode root = new TreeNode(num[0]);
        root.left = new TreeNode(Integer.valueOf(num[1]));
        root.right = new TreeNode(Integer.valueOf(num[2]));
        root.left.left = new TreeNode(Integer.valueOf(num[3]));
        root.left.right = new TreeNode(Integer.valueOf(num[4]));
        root.left.left.left = new TreeNode(Integer.valueOf(num[5]));
        root.left.right.right = new TreeNode(Integer.valueOf(num[6]));
        return root;
    }
}
