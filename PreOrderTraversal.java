package BinaryTreeLeetCode;

import java.awt.List;
import java.util.ArrayList;
import java.util.Stack;

/**
 * Algorithm Preorder(tree) 1. Visit the root. 2. Traverse the left subtree,
 * i.e., call Preorder(left-subtree) 3. Traverse the right subtree, i.e., call
 * Preorder(right-subtree) Uses of Preorder Preorder traversal is used to create
 * a copy of the tree. Preorder traversal is also used to get prefix expression
 * on of an expression tree.
 * 
 * @author u0982683
 *
 */
public class PreOrderTraversal {

	public List<Integer> preorderTraversal(TreeNode root) {
		ArrayList<Integer> endArray = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<>();

		if (root == null) {
			return endArray;
		}
		stack.push = root;
		while (!stack.empty()) {
			TreeNode node = stack.pop();
			endArray.add(node.val);

			if (node.right != null) {
				stack.push(node.right);
			}
			if (node.left != null) {
				stack.push(node.left);
			}
		}
		return endArray;
	}

}
