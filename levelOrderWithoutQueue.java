package sample;

import java.util.ArrayList;
import java.util.List;

public class levelOrderWithoutQueue {
	List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        preorder(root, 0);
        return res;        
    }
    
    private void preorder(TreeNode root, int level) {
        
        if(root == null)
            return;
        
        // size 0, level 0 -> add new list
        //size 1 , level 1

        if(res.size() == level)
            res.add(new ArrayList<Integer>());
        
        res.get(level).add(root.val);
        
        if(root.left != null)
            preorder(root.left,level +1);
        if(root.right != null)
            preorder(root.right, level + 1);
    }
}
