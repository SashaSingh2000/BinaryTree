package BinaryTreeLeetCode;

/**
 * Breadth-First Search is an algorithm to traverse or search in data structures
 * like a tree or a graph. The algorithm starts with a root node and visit the
 * node itself first. Then traverse its neighbors, traverse its second level
 * neighbors, traverse its third level neighbors, so on and so forth.
 * 
 * When we do breadth-first search in a tree, the order of the nodes we visited
 * is in level order. Typically, we use a queue to help us to do BFS.
 * 
 * 
 * Given the root of a binary tree, return the level order traversal of its
 * nodes' values. (i.e., from left to right, level by level).
 * 
 * @author u0982683
 *
 */
public class LevelOrderTraversal {

	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> output = new ArrayList<>();
		if (root == null) {
			return output;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int length = queue.size();
			List<Integer> current = new ArrayList<>();
			for (int i = 0; i < length; i++) {
				TreeNode currently = queue.remove();
				current.add(currently.val);
				if (currently.left != null) {
					queue.add(currently.left);
				}
				if (currently.right != null) {
					queue.add(currently.right);
				}
			}
			output.add(current);
		}
		return output;
	}

}
