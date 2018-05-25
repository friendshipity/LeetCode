import java.util.*;

/**
 * Created by Administrator on 2017/2/16.
 */
public class FindModeinBinarySearchTree501 {
    public int[] findMode(TreeNode root) {
        int[] out =new int[0] ;

        if(root ==null)return out;
        out = new int[1];
        Stack<TreeNode> stack = new Stack<>();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        stack.push(root);
        int treeSize = 0;
        int max=0;
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(map.containsKey(node.val)) {
                map.put(node.val, map.get(node.val) + 1);
                max = Math.max(max, map.get(node.val));
            }
            else
                map.put(node.val,1);
            if(node.left!=null)
                stack.push(node.left);
            if(node.right!=null)
                stack.push(node.right);
            treeSize++;
        }


        if(treeSize==map.keySet().size()){
            out = new int[treeSize];
            int i=0;
            for(int key:map.keySet())
                out[i++]=key;
        }
        else{
            // out[0]=map.keySet().size();
            List<Integer> results =new ArrayList<>();
            for(int key: map.keySet()){
                if(map.get(key) == max)
                    results.add(key);
            }
            out= new int[results.size()];
            for(int i =0;i<out.length;i++){
                out[i] = results.get(i);
            }

        }

        return out;

    }



    }

