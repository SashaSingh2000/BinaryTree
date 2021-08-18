package BinaryTreeLeetCode;

/**
 * Algorithm Postorder(tree) 1. Traverse the left subtree, i.e., call
 * Postorder(left-subtree) 2. Traverse the right subtree, i.e., call
 * Postorder(right-subtree) 3. Visit the root. Postorder traversal is used to
 * delete the tree.
 * 
 * @author u0982683
 *
 */
public class PostOrderTraversal {

	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> values = new ArrayList<Integer>();
		if (root == null) {
			return values;
		}

		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode current = stack.pop();
			values.add(0, current.val);
			if (current.left != null) {
				stack.push(current.left);
			}
			if (current.right != null) {
				stack.push(current.right);
			}
		}
		return values;
	}

}
