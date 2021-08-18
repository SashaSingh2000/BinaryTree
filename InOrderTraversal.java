package BinaryTreeLeetCode;

import java.util.ArrayList;
import java.util.Stack;

/*
 * Algorithm Inorder(tree)
  1. Traverse the left subtree, i.e., call Inorder(left-subtree)
  2. Visit the root.
  3. Traverse the right subtree, i.e., call Inorder(right-subtree)
	 In case of binary search trees (BST), Inorder traversal gives nodes in non-decreasing order. To get nodes of BST in non-increasing order, a variation of Inorder traversal where Inorder traversal s reversed can be used. 
 */
public class InOrderTraversal {

	public List<Integer> inorderTraversal(TreeNode root) {

		Stack<TreeNode> stack = new Stack<>();
		List<Integer> output = new ArrayList<>();

		if (root == null) {
			return output;
		}

		TreeNode current = root;

		while (current != null || !stack.isEmpty()) {
			while (current != null) {
				stack.push(current);
				current = current.left;
			}

			current = stack.pop();
			output.add(current.val);
			current = current.right;
		}
		return output;
	}

}
