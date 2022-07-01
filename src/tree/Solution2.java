package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author lege
 * @Description 二叉树的前序、中序、后序遍历  迭代
 * @create 2022-07-01 14:49
 */
public class Solution2 {

    //前序
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root==null){
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val);
            if (node.right!=null){
                stack.push(node.right);
            }
            if (node.left!=null){
                stack.push(node.left);
            }
        }
        return result;
    }
}
