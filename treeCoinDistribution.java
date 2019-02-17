package sample;

public class treeCoinDistribution {
	int res;
    public int distributeCoins(TreeNode root) {
        fun(root);
        return res;
    }
    
    public int fun(TreeNode r){
        if(r==null) return 0;
        int coins=fun(r.left)+fun(r.right);
        if(r.val==0) coins=coins-1;
        else coins=coins+r.val-1;
        res=res+Math.abs(coins);
        return coins;
    }
}
