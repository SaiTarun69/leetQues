package sample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class postOrderIterative {
	public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null) return new ArrayList<>();
        LinkedList<Integer> li= new LinkedList<>();
        Stack<TreeNode> st= new Stack<>();
        TreeNode r=root;
        while(r!=null||!st.empty()){
            while(r!=null){
                st.add(r);
                li.addFirst(r.val);
                r=r.right;
            }
            r=st.pop();
            r=r.left;
            //if(r!=null) li.add(r.val);
        }
        return li;
    }
}
