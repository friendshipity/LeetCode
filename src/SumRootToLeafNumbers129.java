import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/13.
 */
    public class SumRootToLeafNumbers129 {

    List<String> paths = new ArrayList<>();
    public int sumNumbers(TreeNode root) {
        if(root==null)
            return 0;
//        List<Integer> path  =new ArrayList<>();
        String path = "";
        path=path+String.valueOf(root.val);
        travel(root,path);
        int sum = 0;
        for(String pathCode:paths){
            sum+= Integer.valueOf(pathCode);
        }
        return sum;
    }
    public  void travel(TreeNode node,String path) {

        if (node.left != null) {
            if (node.right == null) {
                path = path + String.valueOf(node.left.val);
                travel(node.left, path);

            }
            if (node.right != null) {
                String nPath = new String(path);
                nPath = nPath + String.valueOf(node.left.val);
                travel(node.left, nPath);
            }
        }
        if (node.right != null) {
            if (node.left == null) {
                path = path + String.valueOf(node.right.val);
                travel(node.right, path);
            }
            if (node.left != null) {
                String nPath = new String(path);
                nPath = nPath + String.valueOf(node.right.val);
                travel(node.right, nPath);
            }
        }
        if (node.right == null && node.left == null) {
            paths.add(path);
        }
    }





        public int sumNumbers2(TreeNode root) {
            return sum(root, 0);
        }

        public int sum(TreeNode n, int s){
            if (n == null) return 0;
            if (n.right == null && n.left == null) return s*10 + n.val;
            return sum(n.left, s*10 + n.val) + sum(n.right, s*10 + n.val);
        }







    public static void main(String[] args){

        int[] num = {0, 1};
        TreeNode root = new TreeNode(num[0]);
        root.right = new TreeNode(Integer.valueOf(num[1]));

        int[] in = {1, 2, 3, 4, 5, 6, 7};
        TreeNode root2 = treeGen.gen(in);


        SumRootToLeafNumbers129 sumRootToLeafNumbers129 = new SumRootToLeafNumbers129();
       int sum =  sumRootToLeafNumbers129.sumNumbers(root);
        System.out.println("123");

    }
}
