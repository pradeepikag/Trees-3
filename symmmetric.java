class Solution {
    public boolean isSymmetric(TreeNode root) {
         return helper(root,root);
    }
    
    public boolean helper(TreeNode root1, TreeNode root2){
        if(root1==null&&root2==null) return true;

        else if((root1!=null)&&(root2!=null)){
            if(root1.left!=null&&root1.right!=null){
                if(root1.val!=root2.val) return false;
                if(((root1.left.val)!=(root2.right.val))||  ((root1.right.val)!=(root2.left.val)))                      {System.out.println("This is false"); return false;}
                return helper(root1.left,root2.right);
            }
        }
        
        return false;
    }
}
