package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class inOrderIterative {
	public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null) return new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        Stack<TreeNode> st= new Stack<>();
        TreeNode r=root;
        while(r!=null||!st.empty()){
            while(r!=null){
                st.add(r);
                r=r.left;
            }
            r=st.pop();
            li.add(r.val);
            r=r.right;
        }
        return li;
    }
}
