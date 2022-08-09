package Inflearn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {

	int val;
	TreeNode left, right;

	TreeNode(int x) {
		this.val = x;
	}
}

public class StackQueue_LOOBT { // Level Order Of Binary Tree;

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		System.out.println(solve(root));

	}

	public static List<List<Integer>> solve(TreeNode root) {

		// 1. ds data structure 추가.

		List<List<Integer>> result = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();

		queue.offer(root); // 큐에 담기.

		// 2. for,while add algo 알고리즘 추가.

		while (!queue.isEmpty()) {   //1 -> 2, 3 

			int size = queue.size(); // 1

			List<Integer> list = new ArrayList<>();

			for (int i = 0; i < size; i++) {
				TreeNode node = queue.poll(); // poll() : 빼면서 삭제.
				list.add(node.val); // 1

				if (node.left != null) {

					queue.offer(node.left);
				}
				if (node.right != null) {

					queue.offer(node.right);
				}
			}
			result.add(list);
		}
		return result;
	}

}
